package ru.itsjava.interfaces;

public class Cat implements Runnable {

    @Override
    public void run() {
        System.out.println("Кот бежит");
    }
    @Override
    public int maxRunDistance() {
        return 0;
    }

}