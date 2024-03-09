package com.n11;

import com.n11.entity.Customer;
import com.n11.repository.ApplicationRepository;
import com.n11.service.CustomerService;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ApplicationRepository repository = new ApplicationRepository();
		CustomerService customerService = new CustomerService(repository);


		System.out.println("Method 1");
		System.out.println(customerService.findAllCustomer());
		System.out.println();

		System.out.println("Method 2");
		Customer newCustomer = new Customer("Yagiz", "Pancak", "technology", new ArrayList<>());
		System.out.println(customerService.saveCustomer(newCustomer));
		System.out.println();

		System.out.println("Method 3");
		String input = "c";
		System.out.println(customerService.searchCustomer(input));
		System.out.println();
	}
}