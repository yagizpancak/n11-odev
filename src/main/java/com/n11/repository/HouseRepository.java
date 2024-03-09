package com.n11.repository;

import com.n11.entity.Home;
import com.n11.entity.House;
import com.n11.entity.Summerhouse;
import com.n11.entity.Villa;

import java.util.ArrayList;
import java.util.List;


public class HouseRepository {
	private List<Home> homeList;
	private List<Summerhouse> summerhouseList;
	private List<Villa> villaList;

	public HouseRepository() {
		homeList = new ArrayList<>();
		homeList.add(new Home(100000, 3, 100));
		homeList.add(new Home(1000000, 6, 300));
		homeList.add(new Home(150000, 4, 160));

		summerhouseList = new ArrayList<>();
		summerhouseList.add(new Summerhouse(200000, 3, 150));
		summerhouseList.add(new Summerhouse(2000000, 6, 350));
		summerhouseList.add(new Summerhouse(350000, 4, 200));

		villaList = new ArrayList<>();
		villaList.add(new Villa(300000, 4, 180));
		villaList.add(new Villa(2500000, 6, 400));
		villaList.add(new Villa(2000000, 6, 350));
	}

	public List<Home> getHomeList() {
		return homeList;
	}

	public List<Summerhouse> getSummerhouseList() {
		return summerhouseList;
	}

	public List<Villa> getVillaList() {
		return villaList;
	}

	public List<House> getHouseList() {
		List<House> houseList = new ArrayList<>();
		houseList.addAll(homeList);
		houseList.addAll(summerhouseList);
		houseList.addAll(villaList);
		return houseList;
	}
}
