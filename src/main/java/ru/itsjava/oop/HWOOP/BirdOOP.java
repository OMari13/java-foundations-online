package ru.itsjava.oop.HWOOP;

public class BirdOOP {
    public static void main(String[] args) {
        Birds bird = new Parrot();
        Birds bird2 = new Crows();

        System.out.println(bird.getBirds());
        System.out.println(bird2.getBirds());
    }
}
