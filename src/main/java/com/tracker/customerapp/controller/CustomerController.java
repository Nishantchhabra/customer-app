package com.tracker.customerapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracker.customerapp.model.Customer;
import com.tracker.customerapp.service.CustomerRepository;

@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepo;

	@GetMapping("info/{name}")
	public String welcome(@PathVariable(value="name") String name) {
		return name + "Welcome to customer app";
	}
	
	@GetMapping("customer/{id}")
	public Optional<Customer> getCustomerById(@PathVariable(value="id") int id) {
		return customerRepo.findById(id);
	}
	
	@GetMapping("get/customer")
	public List<Customer> getAllCustomer() {
		return (List<Customer>) customerRepo.findAll();
	}
	
	@DeleteMapping("customer/{id}")
	public void deleteCustomerById(@PathVariable(value="id") int id) {
		customerRepo.deleteById(id);
	}

}
