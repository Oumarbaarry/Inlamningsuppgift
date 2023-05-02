package com.example.inlamningsuppgift;

import com.example.inlamningsuppgift.Models.Costumer;
import com.example.inlamningsuppgift.Models.Items;
import com.example.inlamningsuppgift.Models.Order;
import com.example.inlamningsuppgift.Repository.CostumerRepo;
//import com.example.inlamningsuppgift.Repository.ItemRepo;
import com.example.inlamningsuppgift.Repository.ItemRepo;
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
    public CommandLineRunner runner(OrderRepo orderRepo, CostumerRepo costumerRepo,ItemRepo repoItem) {
        return (args) -> {


                    Costumer customer1 = new Costumer("Oumar Barry", 1234567890);
                    costumerRepo.save(customer1);
                    Costumer customer2 = new Costumer("Pa Modou Faburay", 1234555890);
                    costumerRepo.save(customer2);
                    Costumer customer3 = new Costumer("Daniel Karimi", 1234566690);
                    costumerRepo.save(customer3);

                    Items item1 = new Items("Nike Sko", 1000);
                    Items item2 = new Items("Golf klubba", 1500);
                    Items item3 = new Items("Penna", 10);

                    repoItem.save(item1);
                    repoItem.save(item2);
                    repoItem.save(item3);

                    Order order1 = new Order(LocalDate.now(), customer1, item1);
                    orderRepo.save(order1);
                    Order order2 = new Order(LocalDate.now(), customer2, item2);
                    orderRepo.save(order2);
                    Order order3 = new Order(LocalDate.now(), customer3,item3);
                    orderRepo.save(order3);

                };
            }




       /* @Bean
        public CommandLineRunner runner2 (ItemRepo repoItem){
            return (args) -> {
                Items item1 = new Items("Nike Sko", 1000);
                Items item2 = new Items("Golf klubba", 1500);
                Items item3 = new Items("Penna", 10);
                Items item4 = new Items("Stol", 500);
                Items item5 = new Items("Mobil", 6000);
                Items item6 = new Items("Säng", 14000);
                Items item7 = new Items("Nike tröja", 200);
                Items item8 = new Items("Levis Jeans", 500);
                Items item9 = new Items("Moncler Jacka", 3000);
                Items item10 = new Items("Stone Island", 3000);

                repoItem.save(item1);
                repoItem.save(item2);
                repoItem.save(item3);
                repoItem.save(item4);
                repoItem.save(item5);
                repoItem.save(item6);
                repoItem.save(item7);
                repoItem.save(item8);
                repoItem.save(item9);
                repoItem.save(item10);


            };
        }*/
    }


