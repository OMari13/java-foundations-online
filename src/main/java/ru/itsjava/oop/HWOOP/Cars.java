package ru.itsjava.oop.HWOOP;

public class Cars {
    private final String model;
    private final int price;

    public Cars(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getCars() {
        return "Модель - " + model + ". " + "Цена - " + price + " " + "рублей";
    }
}
