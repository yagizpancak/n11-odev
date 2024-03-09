package com.n11.service;

import com.n11.entity.Customer;
import com.n11.entity.Invoice;
import com.n11.entity.Order;
import com.n11.repository.ApplicationRepository;

import java.util.List;


public class InvoiceService {
	private ApplicationRepository repository;
	public InvoiceService(ApplicationRepository repository) {
		this.repository = repository;
	}


	public Double findTotalPriceOfUserRegisteredInGivenMonth(int month) {
		return repository.getInvoiceList().stream()
				.filter(invoice -> invoice.getOrder().getCustomer().getRegisterDate().getMonthValue() == month)
				.mapToDouble(Invoice::getTotalPrice)
				.sum();
	}

	public List<Invoice> findAllInvoices() {
		return repository.getInvoiceList();
	}

	public List<Invoice> findInvoicesGreaterThanAmount(double amount) {
		return repository.getInvoiceList().stream()
				.filter(invoice -> invoice.getTotalPrice() > amount)
				.toList();
	}

	public Double findAverageTotalPriceGreaterThanAmount(double amount) {
		return repository.getInvoiceList().stream()
				.filter(invoice -> invoice.getTotalPrice() > amount)
				.mapToDouble(Invoice::getTotalPrice)
				.average()
				.orElse(0.0);
	}

	public List<String> findCustomersLessThanAmount(double amount) {
		return repository.getInvoiceList().stream()
				.filter(invoice -> invoice.getTotalPrice() < amount)
				.map(Invoice::getOrder)
				.map(Order::getCustomer)
				.distinct()
				.map(Customer::getName)
				.toList();
	}

	public List<String> findSectorsLessThanAmount(double amount) {
		return repository.getInvoiceList().stream()
				.filter(invoice -> invoice.getTotalPrice() < amount)
				.map(Invoice::getOrder)
				.map(Order::getCustomer)
				.map(Customer::getSector)
				.distinct()
				.toList();
	}
}
