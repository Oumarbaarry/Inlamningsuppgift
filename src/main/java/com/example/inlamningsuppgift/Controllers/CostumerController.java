package com.example.inlamningsuppgift.Controllers;


import com.example.inlamningsuppgift.Models.Costumer;
import com.example.inlamningsuppgift.Repository.CostumerRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping()
public class CostumerController {
    private final CostumerRepo customerRepo;

    public CostumerController(CostumerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @GetMapping("/customers")
    public List<Costumer> getAllCustomers() {
        return customerRepo.findAll();
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<Costumer> getCustomerById(@PathVariable Long id) {
        Optional<Costumer> customer = customerRepo.findById(id);
        if (customer.isPresent()) {
            return ResponseEntity.ok(customer.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }



    // curl -X POST -H "Content-Type: application/json" -d '{"name": "Kundens Namn", "personnummer": 1234567890}' http://localhost:8080/customers

    @PostMapping("/customers")
    public ResponseEntity<Costumer> createCustomer(@RequestBody Costumer customer) {
        Costumer savedCustomer = customerRepo.save(customer);
        return ResponseEntity.created(URI.create("/customers" + savedCustomer.getId())).body(savedCustomer);
    }
}
