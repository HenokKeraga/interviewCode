package com.example.sample2.Service;


import com.example.sample2.exception.CustomerNotFoundException;
import com.example.sample2.model.Customer;
import com.example.sample2.model.CustomerException;
import com.example.sample2.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CustomerService {

    @Autowired

    private CustomerRepository repository;




    public Optional<Customer> getCustomer(int id) throws CustomerNotFoundException {

        return repository.findById(id);
    }

    public Iterable<Customer> getAllCustomer(){
        return repository.findAll();
    }





}
