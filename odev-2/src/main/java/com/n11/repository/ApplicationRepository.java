package com.n11.repository;

import com.n11.entity.Customer;
import com.n11.entity.Invoice;
import com.n11.entity.Order;
import com.n11.entity.Product;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
public class ApplicationRepository {
	private List<Customer> customerList;
	private List<Invoice> invoiceList;

	public ApplicationRepository() {
		Customer alice = new Customer("Alice", "Kong", "finance", LocalDate.of(2023, 6, 10), new ArrayList<>());
		Customer bob = new Customer("Bob", "Johnson", "healthcare", LocalDate.now(), new ArrayList<>());
		Customer charlie = new Customer("Charlie", "Brown", "education", LocalDate.now(), new ArrayList<>());
		Customer david = new Customer("David", "Williams", "it", LocalDate.now(), new ArrayList<>());
		Customer emily = new Customer("Emily", "Jones", "food", LocalDate.now(), new ArrayList<>());

		Product shoe = new Product("shoe", 2000.0);
		Product sunglasses = new Product("sunglasses",  100.0);
		Product magazine = new Product("magazine", 15.0);
		Product diary = new Product("diary", 40.0);
		Product pencil = new Product("pencil", 5.0);

		Order aliceOrder = new Order(alice, List.of(shoe, sunglasses));
		Order bobOrder = new Order(bob, List.of(magazine, sunglasses));
		Order charlieOrder = new Order(charlie, List.of(diary, pencil));
		Order davidOrder = new Order(david, List.of(shoe, sunglasses, sunglasses, pencil));
		Order emilyOrder = new Order(emily, List.of(magazine, diary, pencil, sunglasses));

		alice.getOrders().add(aliceOrder);
		bob.getOrders().add(bobOrder);
		charlie.getOrders().add(charlieOrder);
		david.getOrders().add(davidOrder);
		emily.getOrders().add(emilyOrder);

		Invoice aliceInvoice = new Invoice(LocalDateTime.now(), aliceOrder);
		Invoice bobInvoice = new Invoice(LocalDateTime.now(), bobOrder);
		Invoice charlieInvoice = new Invoice(LocalDateTime.now(), charlieOrder);
		Invoice davidInvoice = new Invoice(LocalDateTime.now(), davidOrder);
		Invoice emilyInvoice = new Invoice(LocalDateTime.now(), emilyOrder);

		customerList = new ArrayList<>();
		customerList.add(alice);
		customerList.add(bob);
		customerList.add(charlie);
		customerList.add(david);
		customerList.add(emily);

		invoiceList = new ArrayList<>();
		invoiceList.add(aliceInvoice);
		invoiceList.add(bobInvoice);
		invoiceList.add(charlieInvoice);
		invoiceList.add(davidInvoice);
		invoiceList.add(emilyInvoice);

	}
}
