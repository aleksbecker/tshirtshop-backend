package com.turing.tshirtshop.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turing.tshirtshop.entity.Customer;
import com.turing.tshirtshop.repository.CustomerRepository;
import com.turing.tshirtshop.repository.ProductRepository;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ProductRepository productRepository;

	@PutMapping("/customer")
	public void updateCustomer() {

	}

	@GetMapping("/customer")
	public Optional<Customer> getCustomer() {
		return null;
	}

	@PostMapping("/customers")
	public void registerCustomer() {

	}

	@PostMapping("/customers/login")
	public void loginCustomer() {

	}

	@PostMapping("/customers/facebook")
	public void loginFacebookCustomer() {

	}

	@PutMapping("/customers/adresses")
	public void updateAdress() {

	}

	@PutMapping("/customers/creditCard")
	public void updateCreditCard() {

	}

}
