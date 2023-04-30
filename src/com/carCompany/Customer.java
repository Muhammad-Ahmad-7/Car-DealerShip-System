package com.carCompany;

import java.util.ArrayList;

public class Customer {
    //Browse the car
    public void browseCar(ArrayList<Car> car){
        for(Car c: car){
            System.out.println("Make: " + c.getMake() + ", Model: " + c.getModel() + ", Year: " + c.getYear() + ", Price: " + c.getPrice());
        }
    }

    //Buy Car
    public void buyCar(Car car, Purchase purchase){
        System.out.println("Purchase Agreement: ");
        System.out.println("Down Payment "+purchase.getDownPayment());
        System.out.println("Price of Car "+car.getPrice());
        System.out.println("Model "+car.getModel());
        System.out.println("Company Name "+car.getMake());
    }

    //Lease Car info
    public void leaseCar(Car car, Lease lease) {
        double totalLeaseCost = car.getPrice() + lease.getDownPayment() + (lease.getMonthlyPayment() * lease.getYear());
        System.out.println("Lease Agreement: ");
        System.out.println("Monthly Payment: " + lease.getMonthlyPayment());
        System.out.println("Down Payment: " + lease.getDownPayment());
        System.out.println("Lease Term: " + lease.getYear() + " Year");
        System.out.println("Total Lease Cost: " + totalLeaseCost);
    }

    //Calculate Total Cost
    public void calculateTotalCost(Car car, Purchase purchase, Lease lease){
        if(purchase != null){
            System.out.println("Total Cost of the Car For Purchase: "+car.getPrice() + purchase.getDownPayment());
        } else if( lease != null){
            System.out.println("Total Cost of the Car For Lease: "+car.getPrice() + lease.getDownPayment());
        } else {
            System.out.println("Total Cost of Car: "+ car.getPrice());
        }
    }


}
