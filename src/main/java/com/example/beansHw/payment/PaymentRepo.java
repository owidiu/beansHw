package com.example.beansHw.payment;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepo extends CrudRepository<Payment, Integer> {
    PaymentType getType(PaymentType unit);
}
