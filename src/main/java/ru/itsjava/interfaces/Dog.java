package ru.itsjava.interfaces;

public class Dog implements Runnable{

    @Override
    public void run() {
        System.out.println("Собака бежит");
    }

    @Override
    public int maxRunDistance() {
        return 0;
    }
}
