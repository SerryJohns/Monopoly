package com.serionz.monopoly.monopoly.data;

/**
 * Created by edwinkato on 12/18/17.
 */

public class Rent {

    private int withOutHouse;
    private int oneHouse;
    private int twoHouses;
    private int threeHouses;
    private int fourHouses;
    private int Hotel;
    private int Mortgage;
    private int HouseCost;
    private int HotelCostAddition;

    public int getWithOutHouse() {
        return withOutHouse;
    }

    public void setWithOutHouse(int withOutHouse) {
        this.withOutHouse = withOutHouse;
    }

    public int getOneHouse() {
        return oneHouse;
    }

    public void setOneHouse(int oneHouse) {
        this.oneHouse = oneHouse;
    }

    public int getTwoHouses() {
        return twoHouses;
    }

    public void setTwoHouses(int twoHouses) {
        this.twoHouses = twoHouses;
    }

    public int getThreeHouses() {
        return threeHouses;
    }

    public void setThreeHouses(int threeHouses) {
        this.threeHouses = threeHouses;
    }

    public int getFourHouses() {
        return fourHouses;
    }

    public void setFourHouses(int fourHouses) {
        this.fourHouses = fourHouses;
    }

    public int getHotel() {
        return Hotel;
    }

    public void setHotel(int hotel) {
        Hotel = hotel;
    }

    public int getMortgage() {
        return Mortgage;
    }

    public void setMortgage(int mortgage) {
        Mortgage = mortgage;
    }

    public int getHouseCost() {
        return HouseCost;
    }

    public void setHouseCost(int houseCost) {
        HouseCost = houseCost;
    }

    public int getHotelCostAddition() {
        return HotelCostAddition;
    }

    public void setHotelCostAddition(int hotelCostAddition) {
        HotelCostAddition = hotelCostAddition;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "With 1 House=" + oneHouse +
                ", With 2 Houses=" + twoHouses +
                ", With 3 Houses=" + threeHouses +
                ", With 4 Houses=" + fourHouses +
                ", With HOTEL=" + Hotel +
                ", MORTGAGE VALUE=" + Mortgage +
                ", HOUSES COST=" + HouseCost +
                ", HotelCostAddition=" + HotelCostAddition +
                '}';
    }
}
