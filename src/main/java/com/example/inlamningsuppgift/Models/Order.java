package com.example.inlamningsuppgift.Models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Table(name = "orders_table")
@Entity
public class Order {

    @Id
    @GeneratedValue
    protected long id;
    protected LocalDate localDate;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Costumer customer;

    @ManyToOne
    @JoinColumn(name = "items_id")
    private Items item;

    public Order(LocalDate localDate, Costumer customer, Items item) {
        this.localDate = localDate;
        this.customer = customer;
        this.item = item;
    }

}