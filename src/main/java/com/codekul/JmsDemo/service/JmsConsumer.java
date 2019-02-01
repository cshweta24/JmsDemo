package com.codekul.JmsDemo.service;

import com.codekul.JmsDemo.model.Customer;
import com.codekul.JmsDemo.model.MessageStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JmsConsumer {
    @Autowired
    private MessageStorage customerStorage;

    @JmsListener(destination = "${gkz.activemq.queue}", containerFactory="jsaFactory")
    public void receive(Customer customer){
        System.out.println("Recieved Message: " + customer);
        customerStorage.add(customer);
    }
}
