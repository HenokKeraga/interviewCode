package com.example.sample2.controller;
import com.example.sample2.Service.CustomerService;
import com.example.sample2.exception.CustomerNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class CustomerController {

    private  final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<?> getCustomer(@PathVariable int id) throws CustomerNotFoundException {

        return service.getCustomer(id).map(customer -> ResponseEntity.ok().body(customer) )
                .orElse(ResponseEntity.notFound().build());

    }




}
