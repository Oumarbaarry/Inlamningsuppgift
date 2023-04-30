package com.example.inlamningsuppgift.Models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Costumer {

    @Id
    @GeneratedValue
    protected long id;
    protected String name;
    protected long personnummer;



    public Costumer(String name, long personnummer) {
        this.name = name;
        this.personnummer = personnummer;
    }
    @ManyToOne
    @JoinColumn
    private Order order;
}
