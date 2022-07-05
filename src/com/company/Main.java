package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("KG01", "001AAA");
        Car car2 = new Car("KG01", "001VIP");
        Car car3 = new Car("KG03", "001BAT");
        Spesification info1 = new Spesification(2021,"Mersedes", 150000,"Black");
        Spesification info2 = new Spesification(2022,"Mersedes", 170000,"Black");
        Spesification info3 = new Spesification(2022,"Lexus", 160000,"White");
        HashMap <Car, Spesification> avto = new HashMap<>();
        avto.put(car1,info1);
        avto.put(car2,info2);
        avto.put(car3,info3);
        for (Map.Entry<Car, Spesification> carSpesificationEntry : avto.entrySet()) {
            System.out.println(carSpesificationEntry);

        }

    }
}
