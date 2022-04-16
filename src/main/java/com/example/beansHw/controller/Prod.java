package com.example.beansHw.controller;

import com.example.beansHw.payment.PaymentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@Profile("prod")
public class Prod implements AppInterface{
    @Autowired
    Service service;
    @PostMapping("/prod")
    public String cart(@RequestBody Integer customerId, @RequestBody Integer orderId, @RequestBody Integer paymentId,
                     @RequestBody PaymentType type) {
       return "prod";

    }
}
