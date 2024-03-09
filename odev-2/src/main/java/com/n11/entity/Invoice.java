package com.n11.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
	private LocalDateTime date;
	private Double totalPrice;
	private Order order;

	public Invoice(LocalDateTime date, Order order) {
		this.date = date;
		this.order = order;
		setTotalPrice();
	}

	public void setTotalPrice() {
		this.totalPrice = order.getProducts().stream().mapToDouble(Product::getPrice).sum();
	}

	@Override
	public String toString() {
		return "Invoice{" +
				"date=" + date +
				", totalPrice=" + totalPrice +
				", order=" + order +
				'}';
	}
}
