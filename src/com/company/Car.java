package com.company;

public class Car {
    String id;
    String numberOfCar;

    public Car(String id, String numberOfCar) {
        this.id = id;
        this.numberOfCar = numberOfCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", numberOfCar='" + numberOfCar + '\'' +
                '}';
    }
}
