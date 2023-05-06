package ru.itsjava.interfaces;

public class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Птичка летит");
    }

    @Override
    public String flyMaxDistance() {
        return null;
    }
}
