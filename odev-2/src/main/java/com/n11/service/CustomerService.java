package com.n11.service;

import com.n11.entity.Customer;
import com.n11.repository.ApplicationRepository;

import java.util.List;

public class CustomerService {
	private ApplicationRepository repository;
	public CustomerService(ApplicationRepository repository) {
		this.repository = repository;
	}

	public List<Customer> findAllCustomer(){
		return repository.getCustomerList();
	}

	public Customer saveCustomer(Customer customer){
		repository.getCustomerList().add(customer);
		return customer;
	}

	public List<Customer> searchCustomer(String input) {
		return repository.getCustomerList().stream()
				.filter(customer -> customer.getName().toLowerCase().contains(input.toLowerCase()))
				.toList();
	}
}
