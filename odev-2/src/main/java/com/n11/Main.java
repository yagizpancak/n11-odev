package com.n11;

import com.n11.entity.Customer;
import com.n11.repository.ApplicationRepository;
import com.n11.service.CustomerService;
import com.n11.service.InvoiceService;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ApplicationRepository repository = new ApplicationRepository();
		CustomerService customerService = new CustomerService(repository);
		InvoiceService invoiceService = new InvoiceService(repository);


		System.out.println("Method 1");
		System.out.println(customerService.findAllCustomer());
		System.out.println();

		System.out.println("Method 2");
		Customer newCustomer = new Customer("Yagiz", "Pancak", "technology", LocalDate.now(), new ArrayList<>());
		System.out.println(customerService.saveCustomer(newCustomer));
		System.out.println();

		System.out.println("Method 3");
		String input = "c";
		System.out.println(customerService.searchCustomer(input));
		System.out.println();

		System.out.println("Method 4");
		int month = 6;
		System.out.println(invoiceService.findTotalPriceOfUserRegisteredInGivenMonth(month));
		System.out.println();

		System.out.println("Method 5");
		System.out.println(invoiceService.findAllInvoices());
		System.out.println();

		System.out.println("Method 6");
		double amount1 = 1500.0;
		System.out.println(invoiceService.findInvoicesGreaterThanAmount(amount1));
		System.out.println();

		System.out.println("Method 7");
		double amount2 = 1500.0;
		System.out.println(invoiceService.findAverageTotalPriceGreaterThanAmount(amount2));
		System.out.println();

		System.out.println("Method 8");
		double amount3 = 500.0;
		System.out.println(invoiceService.findCustomersLessThanAmount(amount3));
		System.out.println();

		System.out.println("Method 9");
		double amount4 = 750.0;
		System.out.println(invoiceService.findSectorsLessThanAmount(amount4));
		System.out.println();
	}
}