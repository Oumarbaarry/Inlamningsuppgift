package com.example.inlamningsuppgift.Repository;

import com.example.inlamningsuppgift.Models.Costumer;
import com.example.inlamningsuppgift.Models.Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Items,Long> {
}
