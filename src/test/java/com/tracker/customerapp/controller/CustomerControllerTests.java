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
	
/*	@Test
	public void testgetCustomerById() {
		Mockito.when(repo.findById(1).get()).thenReturn		
		Mockito.when(op.get()).thenReturn(customer);
		cc.getCustomerById(1);
	}
	
*/	@Test
	public void testgetAllCustomer() {
		Customer customer = new Customer();
		customer.setDob("10th july");
		customer.setFirstName("Nishant");
		customer.setId(1);
		customer.setLastName("Chhabra");
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
