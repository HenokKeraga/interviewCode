package com.example.sample2.repository;

import com.example.sample2.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository  extends CrudRepository<Customer, Integer> {
}
