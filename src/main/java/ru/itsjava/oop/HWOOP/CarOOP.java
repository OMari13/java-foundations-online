package ru.itsjava.oop.HWOOP;

public class CarOOP {
    public static void main(String[] args) {
        Cars car = new Toyota();
        Cars car2 = new Volga();

        System.out.println(car.getCars());
        System.out.println(car2.getCars());
    }
}
