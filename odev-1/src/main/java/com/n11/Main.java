package com.n11;

import com.n11.repository.HouseRepository;
import com.n11.service.HouseService;

public class Main {
	public static void main(String[] args) {
		HouseService service = new HouseService(new HouseRepository());

		System.out.println("Method 1");
		System.out.println(service.getHomeTotalPrice());
		System.out.println();

		System.out.println("Method 2");
		System.out.println(service.getVillaTotalPrice());
		System.out.println();

		System.out.println("Method 3");
		System.out.println(service.getSummerhouseTotalPrice());
		System.out.println();

		System.out.println("Method 4");
		System.out.println(service.getHouseTotalPrice());
		System.out.println();

		System.out.println("Method 5");
		System.out.println(service.getHomeAverageDimension());
		System.out.println();

		System.out.println("Method 6");
		System.out.println(service.getVillaAverageDimension());
		System.out.println();

		System.out.println("Method 7");
		System.out.println(service.getSummerhouseAverageDimension());
		System.out.println();

		System.out.println("Method 8");
		System.out.println(service.getHouseAverageDimension());
		System.out.println();

		System.out.println("Method 9");
		System.out.println(service.getHouseWithGivenRoomNumber(6));
		System.out.println();
	}
}