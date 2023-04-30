package com.carCompany;

public class Suv extends Car{
    private int numSeats;
    private double cargoCapacity;

    public Suv(String make, String model, int year, double price, int numSeats, double cargoCapacity) {
        this.numSeats = numSeats;
        this.cargoCapacity = cargoCapacity;
        super.setMake(make);
        super.setModel(model);
        super.setYear(year);
        super.setPrice(price);
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}
