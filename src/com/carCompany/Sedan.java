package com.carCompany;

public class Sedan extends Car{
    private int numDoors;
    private double fuelAvg;

    public Sedan(String make, String model, int year, double price, int numDoors, double fuelAvg) {
        this.numDoors = numDoors;
        this.fuelAvg = fuelAvg;
        super.setMake(make);
        super.setModel(model);
        super.setYear(year);
        super.setPrice(price);
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public double getFuelAvg() {
        return fuelAvg;
    }

    public void setFuelAvg(double fuelAvg) {
        this.fuelAvg = fuelAvg;
    }


}
