package com.example.beansHw.controller;

import com.example.beansHw.payment.PaymentType;
import com.example.beansHw.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class AppController {
    @Autowired
    Service service;

    @Autowired
    AppInterface appInterface;

    @Value("${logging.file}")
    private String loggingFile;

    @Value("${myproperty}")
    private String myproperty;

    @PostMapping("/payment")
    public String payment(@RequestBody PaymentType paymentType) {
        service.payment(paymentType);
        return "redirect:/"+loggingFile+"/"+myproperty;
    }
    public String cart(@RequestBody Integer customerId, @RequestBody Integer orderId, @RequestBody Integer paymentId,
                       @RequestBody PaymentType type) {
        return "prod";

    }

}
