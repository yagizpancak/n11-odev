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

	@Override
	public String toString() {
		return "Invoice{" +
				"date=" + date +
				", totalPrice=" + totalPrice +
				", order=" + order +
				'}';
	}
}
