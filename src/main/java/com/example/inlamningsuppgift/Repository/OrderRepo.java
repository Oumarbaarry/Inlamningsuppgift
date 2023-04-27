package com.example.inlamningsuppgift.Repository;

import com.example.inlamningsuppgift.Models.Costumer;
import com.example.inlamningsuppgift.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,Long> {
}
