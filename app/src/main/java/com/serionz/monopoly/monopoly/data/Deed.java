package com.serionz.monopoly.monopoly.data;

/**
 * Created by edwinkato on 12/18/17.
 */

public class Deed {
    private String name;
    private String type; // can be utility, property, station
    private  String rentAmt;
    private Integer color;
    private Rent rent;
    private String utilityConditionOne;
    private String utilityConditionTwo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRentAmt() {
        return rentAmt;
    }

    public void setRentAmt(String rentAmt) {
        this.rentAmt = rentAmt;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public String getUtilityConditionOne() {
        return utilityConditionOne;
    }

    public void setUtilityConditionOne(String utilityConditionOne) {
        this.utilityConditionOne = utilityConditionOne;
    }

    public String getUtilityConditionTwo() {
        return utilityConditionTwo;
    }

    public void setUtilityConditionTwo(String utilityConditionTwo) {
        this.utilityConditionTwo = utilityConditionTwo;
    }

    @Override
    public String toString() {
        return "Deed{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", rentAmt='" + rentAmt + '\'' +
                ", color=" + color +
                ", rent=" + rent +
                ", utilityConditionOne='" + utilityConditionOne + '\'' +
                ", utilityConditionTwo='" + utilityConditionTwo + '\'' +
                '}';
    }
}
