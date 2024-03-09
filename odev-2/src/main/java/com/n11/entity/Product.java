package com.n11.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	private String name;
	private BigDecimal price;

	@Override
	public String toString() {
		return "Product{" +
				"productName='" + name + '\'' +
				", price=" + price +
				'}';
	}
}
