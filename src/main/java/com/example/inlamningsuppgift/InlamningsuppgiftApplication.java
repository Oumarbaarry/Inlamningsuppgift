package com.example.inlamningsuppgift;

import com.example.inlamningsuppgift.Models.Costumer;
import com.example.inlamningsuppgift.Models.Order;
import com.example.inlamningsuppgift.Repository.CostumerRepo;
//import com.example.inlamningsuppgift.Repository.ItemRepo;
import com.example.inlamningsuppgift.Repository.OrderRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class InlamningsuppgiftApplication {

    public static void main(String[] args) {
        SpringApplication.run(InlamningsuppgiftApplication.class, args);
    }

        @Bean
        public CommandLineRunner runner(OrderRepo orderRepo, CostumerRepo costumerRepo){
            return(args)->{
                List<Order> orders1 = new ArrayList<>();
                Order order1 = new Order();
                order1.setLocalDate(LocalDate.now());
                orders1.add(order1);
                orderRepo.save(order1);
                System.out.println("Order added...");
                List<Order> orders2 = new ArrayList<>();
                Order order2 = new Order();
                order2.setLocalDate(LocalDate.now());
                orders2.add(order2);
                orderRepo.save(order2);
                System.out.println("Order added...");

                Costumer customer1 = new Costumer();
                customer1.setName("Oumar Barry");
                customer1.setPersonnummer(1234567890);
                customer1.setOrders(orders1);

                System.out.println("Customer added");

                Costumer customer2 = new Costumer();
                customer2.setName("Daniel KaninMun");
                customer2.setPersonnummer(121324422);
                customer2.setOrders(orders2);

                costumerRepo.save(customer1);
                costumerRepo.save(customer2);
            };

    }
    }

