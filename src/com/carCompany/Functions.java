package com.carCompany;

import java.util.Scanner;

public class Functions {
    DealerShip dealerShip;
    public Functions(DealerShip dealerShip) {
        this.dealerShip = dealerShip;
    }

    Scanner input = new Scanner(System.in);
    void buyCar(){
        String name;
        System.out.println("Available Car For Buying: ");
        dealerShip.showCar();
        System.out.println("Enter Name Of Selected Car: ");
        name = input.nextLine();
        dealerShip.showCarBuy(name);
        System.out.println("Congratulations");
        if (DealerShip.count != 0){
            System.out.println("Remaining Available Cars: ");
            dealerShip.showCar();
        }
    }
    void leaseCar(){
        String name;
        System.out.println("Available Car For Lease: ");
        dealerShip.showCar();
        System.out.println("Enter Name Of Selected Car: ");
        name = input.nextLine();
        dealerShip.showCarLease(name);
        System.out.println("Thanks for Leasing Car From Us");
        if (DealerShip.count != 0){
            System.out.println("Remaining Available Cars: ");
            dealerShip.showCar();
        }
    }

    public void showCar() {
        dealerShip.showCar();
    }
}
