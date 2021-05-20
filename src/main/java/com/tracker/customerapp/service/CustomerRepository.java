package com.tracker.customerapp.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.tracker.customerapp.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
