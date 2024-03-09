package com.n11.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
	private LocalDateTime date;
	private BigDecimal totalPrice;
	private Order order;

	public Invoice(LocalDateTime date, Order order) {
		this.date = date;
		this.order = order;
		setTotalPrice();
	}

	public void setTotalPrice() {
		BigDecimal total = BigDecimal.ZERO;

		for (Product p : order.getProducts()) {
			total = total.add(p.getPrice());
		}
		this.totalPrice = total;
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
