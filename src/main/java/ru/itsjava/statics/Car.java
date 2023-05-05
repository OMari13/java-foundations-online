package ru.itsjava.statics;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Car {

    private String model;
    private String color;
    private static double price = 200_000.0;

    public double getPrice(){
        return price;
    }
}
