package ru.itsjava.statics;

public class Main {
    public static void main(String[] args) {

        Car uazCar = new Car("UAZ","grey");
        Car bmvCar = new Car("BMV","black");

        System.out.println("uazCar.getPrice() = " + uazCar.getPrice());
        System.out.println("bmvCar.getPrice() = " + bmvCar.getPrice());

    }
}

