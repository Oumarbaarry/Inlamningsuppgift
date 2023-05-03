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

   /* @Bean
    public CommandLineRunner runner(OrderRepo orderRepo, CostumerRepo costumerRepo,ItemRepo repoItem) {
        return (args) -> {


                    Costumer customer1 = new Costumer("Oumar Barry", 951019101);
                    costumerRepo.save(customer1);
                    Costumer customer2 = new Costumer("Pa Modou Faburay", 1234555890);
                    costumerRepo.save(customer2);
                    Costumer customer3 = new Costumer("Daniel Karimi", 971020101);
                    costumerRepo.save(customer3);
                    Costumer customer4 = new Costumer("Daniela Oskarsson", 921001202);
                    costumerRepo.save(customer4);
                    Costumer customer5 = new Costumer("Birgitta Fredriksson", 911059201);
                    costumerRepo.save(customer5);
                    Costumer customer6 = new Costumer("Amanda Karlsson", 970119101);
                    costumerRepo.save(customer6);
                    Costumer customer7 = new Costumer("Mohammed Bin Fata", 980219101);
                    costumerRepo.save(customer7);
                    Costumer customer8 = new Costumer("Ahmed Hussain", 930719101);
                    costumerRepo.save(customer8);
                    Costumer customer9 = new Costumer("Hannah Hannah", 960819101);
                    costumerRepo.save(customer9);
                    Costumer customer10 = new Costumer("David Davidsson", 950121101);
                    costumerRepo.save(customer10);

                    Items item1 = new Items("Nike Sko", 1000);
                    Items item2 = new Items("Golf klubba", 1500);
                    Items item3 = new Items("Damskor", 1599);
                    Items item4 = new Items("Kläning", 1500);
                    Items item5 = new Items("Mobil", 6000);
                    Items item6 = new Items("Säng", 14000);
                    Items item7 = new Items("Nike tröja", 1200);
                    Items item8 = new Items("Klackskor", 2000);
                    Items item9 = new Items("Moncler Jacka", 6000);
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

                    Order order1 = new Order(LocalDate.now(), customer1, item5);
                    orderRepo.save(order1);
                    Order order2 = new Order(LocalDate.now(), customer2, item2);
                    orderRepo.save(order2);
                    Order order3 = new Order(LocalDate.now(), customer3,item1);
                    orderRepo.save(order3);
                    Order order4 = new Order(LocalDate.now(), customer4,item3);
                    orderRepo.save(order4);
                    Order order5 = new Order(LocalDate.now(), customer5,item4);
                    orderRepo.save(order5);
                    Order order6 = new Order(LocalDate.now(), customer6,item8);
                    orderRepo.save(order6);
                    Order order7 = new Order(LocalDate.now(), customer7,item7);
                    orderRepo.save(order7);
                    Order order8 = new Order(LocalDate.now(), customer8,item9);
                    orderRepo.save(order8);
                    Order order9 = new Order(LocalDate.now(), customer9,item8);
                    orderRepo.save(order9);
                    Order order10 = new Order(LocalDate.now(), customer10,item10);
                    orderRepo.save(order10);
                };
            }*/
    }


