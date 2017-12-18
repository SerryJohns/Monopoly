package com.serionz.monopoly.monopoly.models;

/**
 * Created by johnpaulseremba on 18/12/2017.
 */

public class Rent {
	private String oneHouse;
	private String twoHouses;
	private String threeHouses;
	private String fourHouses;
	private String Hotel;
	private String Mortgage;
	private String HouseCost;
	private String HotelCostAddition;

	public Rent(String oneHouse, String twoHouses, String threeHouses, String fourHouses,
			String hotel, String mortgage, String houseCost, String hotelCostAddition) {
		this.oneHouse = oneHouse;
		this.twoHouses = twoHouses;
		this.threeHouses = threeHouses;
		this.fourHouses = fourHouses;
		Hotel = hotel;
		Mortgage = mortgage;
		HouseCost = houseCost;
		HotelCostAddition = hotelCostAddition;
	}

	public String getOneHouse() {
		return oneHouse;
	}

	public void setOneHouse(String oneHouse) {
		this.oneHouse = oneHouse;
	}

	public String getTwoHouses() {
		return twoHouses;
	}

	public void setTwoHouses(String twoHouses) {
		this.twoHouses = twoHouses;
	}

	public String getThreeHouses() {
		return threeHouses;
	}

	public void setThreeHouses(String threeHouses) {
		this.threeHouses = threeHouses;
	}

	public String getFourHouses() {
		return fourHouses;
	}

	public void setFourHouses(String fourHouses) {
		this.fourHouses = fourHouses;
	}

	public String getHotel() {
		return Hotel;
	}

	public void setHotel(String hotel) {
		Hotel = hotel;
	}

	public String getMortgage() {
		return Mortgage;
	}

	public void setMortgage(String mortgage) {
		Mortgage = mortgage;
	}

	public String getHouseCost() {
		return HouseCost;
	}

	public void setHouseCost(String houseCost) {
		HouseCost = houseCost;
	}

	public String getHotelCostAddition() {
		return HotelCostAddition;
	}

	public void setHotelCostAddition(String hotelCostAddition) {
		HotelCostAddition = hotelCostAddition;
	}

}
