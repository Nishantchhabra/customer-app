package com.tracker.customerapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CustomerController {

	@GetMapping("info/{name}")
	public String welcome(@PathVariable(value="name") String name) {
		return name + "Welcome to customer app";
	}
}
