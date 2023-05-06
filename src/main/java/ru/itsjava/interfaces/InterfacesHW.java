package ru.itsjava.interfaces;

public class InterfacesHW {
    public static void main(String[] args) {

        Walkable man = new Man();
        man.walk();

        Runnable cat = new Cat();
        cat.run();
        cat.maxRunDistance();

        Swimable fish = new Fish();
        fish.swim();
        fish.maxSwimSpeed();

        Flyable bird = new Bird();
        bird.fly();
        bird.flyMaxDistance();

        Runnable dog = new Dog();
        dog.run();
        dog.maxRunDistance();

    }
}
