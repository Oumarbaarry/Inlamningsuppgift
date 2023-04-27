package com.example.inlamningsuppgift.Repository;

import com.example.inlamningsuppgift.Models.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CostumerRepo extends JpaRepository<Costumer,Long> {
}
