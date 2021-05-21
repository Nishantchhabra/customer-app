package com.tracker.customerapp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

import com.tracker.customerapp.model.Customer;
import com.tracker.customerapp.service.CustomerRepository;

@RunWith(SpringRunner.class)
public class CustomerControllerTests {
	
	@InjectMocks
	private CustomerController cc;
	
	@Mock
	private CustomerRepository repo;

	@Test
	public void welcome() {
		cc.welcome("Nishant");
	}
	
	@Test
	public void testgetCustomerById() {
		Customer customer = new Customer(1,"Nishant","Chhabra","10th July");
		Mockito.when(repo.findById(1)).thenReturn(Optional.of(customer));	
		cc.getCustomerById(1);
	}
	
	@Test
	public void testgetAllCustomer() {
		Customer customer = new Customer(1,"Nishant","Chhabra","10th July");
		List<Customer> customers = new ArrayList<>();
		customers.add(customer);
		Mockito.when(repo.findAll()).thenReturn(customers);
		cc.getAllCustomer();
	}
	
	@Test
	public void testdeleteCustomerById() {
		cc.deleteCustomerById(1);
	}
}
