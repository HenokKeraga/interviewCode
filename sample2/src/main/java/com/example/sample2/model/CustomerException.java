package com.example.sample2.model;


public class CustomerException {
    private String message;

    public CustomerException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
