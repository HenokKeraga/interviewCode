package com.example.sample2;

import com.example.sample2.model.Customer;
import com.example.sample2.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Sample2Application  implements CommandLineRunner {
    @Autowired
    private CustomerRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Sample2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        var list= List.of(
                new Customer("Sreek","irving"),
                new Customer("abebe","colorado")
        );


        list.stream().forEach(c->repository.save(c));


    }
}
