package ru.itsjava.oop.inheritance;

public class Main {
    public static void main(String[] args) {

        Cow marfa = new Cow();
        marfa.eat();
        marfa.talk();

        Man smart = new Man();
        smart.eat();
        smart.talk();

        Plant flower = new Plant();
        flower.eat();
        flower.talk();
    }
}
