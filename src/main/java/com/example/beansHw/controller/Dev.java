package com.example.beansHw.controller;

import com.example.beansHw.order.OrderRepo;
import com.example.beansHw.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.criteria.Order;

@Component
@Profile("dev")
public class Dev implements AppInterface {

    @Autowired
    Service service;
    @PostMapping("/dev")
    public String post() {
        return "dev";
    }

    public Order getOrder() {
        return service.getOrder();
    }

}
