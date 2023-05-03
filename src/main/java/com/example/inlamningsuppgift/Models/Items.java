package com.example.inlamningsuppgift.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Entity
public class Items {

    @Id
    @GeneratedValue
    protected long id;
    protected String name;
    protected long pris;

    public Items(String name, long pris) {
        this.name = name;
        this.pris = pris;
    }


    @JsonBackReference
    @OneToMany(mappedBy = "item")
    private List<Order> orders;
}

