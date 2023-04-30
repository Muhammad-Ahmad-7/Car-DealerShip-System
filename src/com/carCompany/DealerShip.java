package com.carCompany;

import java.util.ArrayList;
import java.util.Objects;

public class DealerShip {
    ArrayList<Car> carList = new ArrayList<Car>();
    static int count;

    //Add Car
    void addCar(Car car){
        carList.add(car);
    }

    //Remove Car
    void removeCar(Car car){
        carList.remove(car);
    }
    void showCar() {
        if (carList != null && !carList.isEmpty()) {
            for (Car tempCar: carList) {
                System.out.println(tempCar.toString());
            }
        } else {
            System.out.println("No cars in the dealership.");
        }
    }

    void showCarBuy(String name){
        if (carList != null){
            for (Car tempCar: carList){
                if (Objects.equals(tempCar.getMake(), name)){
                    count++;
                    System.out.println(tempCar.toString());
                    this.removeCar(tempCar);
                    break;
                }
            }
        }
    }

    void showCarLease(String name){
        if (carList != null){
            for (Car tempCar: carList){
                if (Objects.equals(tempCar.getMake(), name)){
                    count++;
                    System.out.println(tempCar.toString());
                    this.removeCar(tempCar);
                    break;
                }
            }
        }
    }
}
