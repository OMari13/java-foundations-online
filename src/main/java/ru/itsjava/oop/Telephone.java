package ru.itsjava.oop;

public class Telephone {
    private final String brand;
    private boolean isHomey;

    public Telephone(String brand) { //String brand входящий параметр
        this.brand = brand;//this указывает на поле этого объекта
    }

    public Telephone(String brand, boolean isHomey) {
        this.brand = brand;
        this.isHomey = isHomey;
    }

    public String toString() {
        return "{ brand: " + brand + "isHomey: " + isHomey + "}";
    }
}
