package com.example.inlamningsuppgift.Repository;

import com.example.inlamningsuppgift.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CostumerRepo extends JpaRepository<Order, Long> {
}
