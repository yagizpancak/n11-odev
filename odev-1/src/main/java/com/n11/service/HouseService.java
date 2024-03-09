package com.n11.service;

import com.n11.entity.Home;
import com.n11.entity.House;
import com.n11.entity.Summerhouse;
import com.n11.entity.Villa;
import com.n11.repository.HouseRepository;

import java.util.List;

public class HouseService {
	private HouseRepository houseRepository;

	public HouseService(HouseRepository houseRepository) {
		this.houseRepository = houseRepository;
	}

	public int getHomeTotalPrice(){
		List<Home> homeList = houseRepository.getHomeList();
		return homeList.stream().mapToInt(Home::getPrice).sum();
	}

	public int getSummerhouseTotalPrice(){
		List<Summerhouse> summerhouseList = houseRepository.getSummerhouseList();
		return summerhouseList.stream().mapToInt(Summerhouse::getPrice).sum();
	}

	public int getVillaTotalPrice(){
		List<Villa> villaList = houseRepository.getVillaList();
		return villaList.stream().mapToInt(Villa::getPrice).sum();
	}

	public int getHouseTotalPrice(){
		List<House> houseList = houseRepository.getHouseList();
		return houseList.stream().mapToInt(House::getPrice).sum();
	}

	public double getHomeAverageDimension(){
		List<Home> homeList = houseRepository.getHomeList();
		return homeList.stream().mapToDouble(Home::getDimension).average().orElse(0.0);
	}

	public double getSummerhouseAverageDimension(){
		List<Summerhouse> summerhouseList = houseRepository.getSummerhouseList();
		return summerhouseList.stream().mapToDouble(Summerhouse::getDimension).average().orElse(0.0);
	}

	public double getVillaAverageDimension(){
		List<Villa> villaList = houseRepository.getVillaList();
		return villaList.stream().mapToDouble(Villa::getDimension).average().orElse(0.0);
	}

	public double getHouseAverageDimension(){
		List<House> houseList = houseRepository.getHouseList();
		return houseList.stream().mapToDouble(House::getDimension).average().orElse(0.0);
	}

	public List<House> getHouseWithGivenRoomNumber(int roomNumber){
		List<House> houseList = houseRepository.getHouseList();
		return houseList.stream().filter(house -> roomNumber == house.getNumberOfRoom()).toList();
	}
}
