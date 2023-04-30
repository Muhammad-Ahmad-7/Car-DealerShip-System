package com.carCompany;

public class Purchase {
    private int year;
    private double interestRate;
    private double downPayment;

    public Purchase(int year, double interestRate, double downPayment) {
        this.year = year;
        this.interestRate = interestRate;
        this.downPayment = downPayment;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }
}
