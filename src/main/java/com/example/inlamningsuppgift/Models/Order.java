package com.example.inlamningsuppgift.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
    protected LocalDate localDate;
    protected String kund;
    protected String varor;

    


    public Order(LocalDate localDate, String kund, String varor) {
        this.localDate = localDate;
        this.kund = kund;
        this.varor = varor;
    }
}