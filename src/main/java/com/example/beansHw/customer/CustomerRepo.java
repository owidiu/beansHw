package com.example.beansHw.customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Integer> {
    Integer getId(Integer customerId);
}
