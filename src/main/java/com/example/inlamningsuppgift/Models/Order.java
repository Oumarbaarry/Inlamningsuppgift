package com.example.inlamningsuppgift.Models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Order {

    @Id
    @GeneratedValue
    protected long id;
    protected LocalDate datum;
    protected String kund;
    @ManyToOne
    @JoinColumn(name = "product_id")
    Costumer costumer;
     protected String varor;




}