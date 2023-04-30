package com.carCompany;

public class Lease {
    private int year;
    private double downPayment;
    private double monthlyPayment;

    public Lease(int year, double downPayment, double monthlyPayment) {
        this.year = year;
        this.downPayment = downPayment;
        this.monthlyPayment = monthlyPayment;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getDownPayment() {
        return downPayment;
    }

    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }
}
