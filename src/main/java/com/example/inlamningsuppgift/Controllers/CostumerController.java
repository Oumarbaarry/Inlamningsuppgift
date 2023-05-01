package com.example.inlamningsuppgift.Controllers;


import com.example.inlamningsuppgift.Models.Costumer;
import com.example.inlamningsuppgift.Repository.CostumerRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CostumerController {
    private final CostumerRepo customerRepo;

    public CostumerController(CostumerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @GetMapping
    public List<Costumer> getAllCustomers() {
        return customerRepo.findAll();
    }

    @GetMapping("/{id}")
    public Costumer getCustomerById(@PathVariable Long id) {
        return customerRepo.findById(id).orElseThrow();
    }

    @PostMapping("/add")
    public Costumer addCustomer(@RequestBody Costumer newCustomer) {
        return customerRepo.save(newCustomer);
    }




    // curl -X POST -H "Content-Type: application/json" -d '{"name": "Kundens Namn", "personnummer": 1234567890}' http://localhost:8080/customers

    @PostMapping
    public ResponseEntity<Costumer> createCustomer(@RequestBody Costumer customer) {
        Costumer savedCustomer = customerRepo.save(customer);
        return ResponseEntity.created(URI.create("/customers/" + savedCustomer.getId())).body(savedCustomer);
    }
}
