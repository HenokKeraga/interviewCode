package com.example.sample.controller;

import com.example.sample.Service.CustomerService;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private  final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<?> getCustomer(@PathVariable int id) {

        return service.getCustomer(id).map(customer -> ResponseEntity.ok().body(customer)).orElse(ResponseEntity.notFound().build());
    }


}
