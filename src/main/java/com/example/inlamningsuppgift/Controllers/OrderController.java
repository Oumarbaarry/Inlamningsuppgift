package com.example.inlamningsuppgift.Controllers;

import com.example.inlamningsuppgift.Models.Costumer;
import com.example.inlamningsuppgift.Models.Items;
import com.example.inlamningsuppgift.Models.Order;
import com.example.inlamningsuppgift.Repository.CostumerRepo;
import com.example.inlamningsuppgift.Repository.ItemRepo;
import com.example.inlamningsuppgift.Repository.OrderRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderRepo orderRepo;
    private final CostumerRepo customerRepo;
    private final ItemRepo itemRepo;

    public OrderController(OrderRepo orderRepo, CostumerRepo customerRepo, ItemRepo itemRepo) {
        this.orderRepo = orderRepo;
        this.customerRepo = customerRepo;
        this.itemRepo = itemRepo;
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }

    @GetMapping("/{customerId}")
    public List<Order> getOrdersByCustomerId(@PathVariable Long customerId) {
        Costumer customer = customerRepo.findById(customerId).orElseThrow();
        return customer.getOrders();
    }

    @PostMapping("/buy")
    public ResponseEntity<String> buyItem(@RequestParam Long customerId, @RequestParam Long itemId) {
        Costumer customer = customerRepo.findById(customerId).orElseThrow();
        Items item = itemRepo.findById(itemId).orElseThrow();
        Order order = new Order(LocalDate.now(), customer, item);
        orderRepo.save(order);
        return ResponseEntity.ok("Purchase completed successfully");
    }
}