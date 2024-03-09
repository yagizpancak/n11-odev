package com.n11.entity;

public abstract class House {
	private int price;
	private int numberOfRoom;
	private double dimension;

	public House(int price, int numberOfRoom, double dimension) {
		this.price = price;
		this.numberOfRoom = numberOfRoom;
		this.dimension = dimension;
	}

	public int getPrice() {
		return price;
	}

	public int getNumberOfRoom() {
		return numberOfRoom;
	}

	public double getDimension() {
		return dimension;
	}

	@Override
	public String toString() {
		return "House\n{" +
				"price=" + price +
				",\n numberOfRoom=" + numberOfRoom +
				",\n dimension=" + dimension +
				"}\n";
	}
}
