package com.tracker.customerapp.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class CustomerControllerTests {
	
	@InjectMocks
	private CustomerController cc;
	 

	@Test
	public void welcome() {
		cc.welcome("Nishant");
	}
}
