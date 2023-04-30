package com.carCompany;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car c = new Car();
        Sedan sedan = new Sedan("Honda","2020",2022,75.5,4,12.4);
        Suv suv = new Suv("Toyota","2021",2020,80.6,2,23.5);
        SportsCar sportsCar = new SportsCar("Ferari","2016",2016,54.2,720.6,65);
        DealerShip dealerShip = new DealerShip();
        dealerShip.addCar(sedan);
        dealerShip.addCar(suv);
        dealerShip.addCar(sportsCar);
        Customer customer = new Customer();
        Functions func = new Functions(dealerShip);
        Lease lease = new Lease(2,1200.0,50);
        Purchase purchase = new Purchase(10,5,80000);
        int choice;
        do {
            System.out.println("Choose Option From The Menu: ");
            System.out.println("1: Buy Car");
            System.out.println("2: Lease Car");
            System.out.println("3: Available Cars");
            System.out.println("0: Exit Software");
            choice = input.nextInt();
            if (choice == 1) {
                func.buyCar();
            } else if(choice == 2){
                func.leaseCar();
            } else if(choice == 3){
                System.out.println("Available Cars: ");
                func.showCar();
            }
        }while(choice != 0);
    }
}
