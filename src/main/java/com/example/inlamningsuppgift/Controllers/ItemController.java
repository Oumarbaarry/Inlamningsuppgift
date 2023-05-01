package com.example.inlamningsuppgift.Controllers;

import com.example.inlamningsuppgift.Models.Items;
import com.example.inlamningsuppgift.Repository.ItemRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
    private final ItemRepo itemRepo;

    public ItemController(ItemRepo itemRepo) {
        this.itemRepo = itemRepo;
    }

    @GetMapping
    public List<Items> getAllItems() {
        return itemRepo.findAll();
    }

    @GetMapping("/{id}")
    public Items getItemById(@PathVariable Long id) {
        return itemRepo.findById(id).orElseThrow();
    }

    @PostMapping("/add")
    public Items addItem(@RequestBody Items newItem) {
        return itemRepo.save(newItem);
    }



//curl -X POST -H "Content-Type: application/json" -d '{"name":"Mjölk", "pris":15}'
    @PostMapping
    public ResponseEntity<Items> createItem(@RequestBody Items item) {
        Items savedItem = itemRepo.save(item);
        return ResponseEntity.created(URI.create("/items/" + savedItem.getId())).body(savedItem);
    }
}
