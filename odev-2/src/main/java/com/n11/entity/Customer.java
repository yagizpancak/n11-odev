package com.n11.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	private String name;
	private String surname;
	private String sector;
	private LocalDate registerDate;
	private List<Order> orders;

	@Override
	public String toString() {
		return "Customer{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", sector='" + sector + '\'' +
				'}';
	}
}
