package com.example.sample.Service;
import com.example.sample.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    List<Customer> list= new ArrayList<>();


    public Optional<Customer> getCustomer(int id) {
        addAllCustomer();

        return  list.stream().filter(customer -> customer.getId()==id).findFirst();
    }

    public  void  addAllCustomer(){
        list.add(new Customer(1,"Sreek","irving"));
        list.add(new Customer(2,"abebe","colorado"));
    }



}
