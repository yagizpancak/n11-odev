package com.n11.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	private String name;
	private Double price;

	@Override
	public String toString() {
		return "Product{" +
				"productName='" + name + '\'' +
				", price=" + price +
				'}';
	}
}
