package com.codekul.JmsDemo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class MessageStorage {

    private List<Customer>customers=new ArrayList<>();

    public void add(Customer customer) {
        customers.add(customer);
    }

    public void clear() {
        customers.clear();
    }

    public List<Customer> getAll(){
        return customers;
    }

}
