package com.codekul.JmsDemo.controller;


import com.codekul.JmsDemo.model.Customer;
import com.codekul.JmsDemo.model.MessageStorage;
import com.codekul.JmsDemo.service.JmsProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestAPIs {

    @Autowired
    private JmsProducer jmsProducer;


    @Autowired
    private MessageStorage customerStorage;

    @PostMapping(value="/api/customer")
    public Customer postCustomer(@RequestBody Customer customer){
        jmsProducer.send(customer);
        return customer;
    }
    @GetMapping(value="/api/customers")
    public List<Customer> getAll(){
        List<Customer> customers = customerStorage.getAll();
        return customers;
    }

    @DeleteMapping(value="/api/customers/clear")
    public String clearCustomerStorage() {
        customerStorage.clear();
        return "Clear All CustomerStorage!";
    }
}
