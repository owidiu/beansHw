package com.example.beansHw.service;

import com.example.beansHw.customer.CustomerRepo;
import com.example.beansHw.order.OrderRepo;
import com.example.beansHw.payment.PaymentRepo;
import com.example.beansHw.payment.PaymentType;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.criteria.Order;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    CustomerRepo customerRepo;
    @Autowired
    OrderRepo orderRepo;
    @Autowired
    PaymentRepo paymentRepo;

    public String cart(Integer customerId, Integer orderId, Integer paymentId, PaymentType type) {
        if(paymentRepo.getType(PaymentType.UNIT) == type) {
            return "Customer " + customerId + " has made an order " + orderId + " with payment "
                    + paymentId + " of type " + type;
        }
        else if (paymentRepo.getType(PaymentType.STOCK) == type) {
            return "Customer " + customerId + " has made an order " + orderId + " with payment "
                    + paymentId + " of type " + type;
        }
        else return "Invalid payment type";

    }

    public Order getOrder() {
        return orderRepo.getOrder();
    }

    public void payment(PaymentType paymentType) {
    }
}
