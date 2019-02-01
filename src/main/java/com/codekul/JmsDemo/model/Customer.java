package com.codekul.JmsDemo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {


    private Long id;
    private String firstname;
    private String lastname;
    private int age;

    public Customer(){
    }

    public Customer(String firstname, String lastname, int age)
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Customer(Long id, String firstname, String lastname, int age)
    {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }
}
