package com.example.inlamningsuppgift.Controllers;

import com.example.inlamningsuppgift.Models.Costumer;
import com.example.inlamningsuppgift.Models.Items;
import com.example.inlamningsuppgift.Models.Order;
import com.example.inlamningsuppgift.Repository.CostumerRepo;
import com.example.inlamningsuppgift.Repository.ItemRepo;
import com.example.inlamningsuppgift.Repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
    private final ItemRepo itemRepo;
    private final CostumerRepo customerRepo;
    private final OrderRepo orderRepo;


    @Autowired
    public ItemController(ItemRepo itemRepo, CostumerRepo customerRepo, OrderRepo orderRepo) {
        this.itemRepo = itemRepo;
        this.customerRepo = customerRepo;
        this.orderRepo = orderRepo;
    }
    @GetMapping
    public List<Items> getAllItems() {
        return itemRepo.findAll();
    }

    @GetMapping("/{id}")
    public Items getItemById(@PathVariable Long id) {
        return itemRepo.findById(id).orElseThrow();
    }

    //curl -X POST -H "Content-Type: application/json" -d '{"name": "Canada Goose", "pris":"12000"}' http://localhost:8080/items
    @PostMapping()
    public Items addItem(@RequestBody Items newItem) {
        return itemRepo.save(newItem);
    }


    //curl -X POST "http://localhost:8080/items/buy?name=John&personnummer=9201012202&itemId=10"
    @PostMapping("/buy")
    public ResponseEntity<String> buyItem(@RequestParam String name, @RequestParam Long personnummer, @RequestParam Long itemId) {
        System.out.println(name + " " + personnummer + " " + itemId);
        Costumer customer = customerRepo.save(new Costumer(name, personnummer));
        Items item = itemRepo.findById(itemId).orElseThrow();
        Order order = orderRepo.save(new Order(LocalDate.now(), customer, item));
        return ResponseEntity.ok("Purchase completed successfully");
    }
}