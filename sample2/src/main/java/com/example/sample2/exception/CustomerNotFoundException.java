package com.example.sample2.exception;



import org.springframework.stereotype.Component;


@Component
public class CustomerNotFoundException extends Exception {


    public CustomerNotFoundException(String message) {
        super(message);
    }
}
