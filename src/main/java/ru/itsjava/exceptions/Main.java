package ru.itsjava.exceptions;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Маша", 154);

        try {
            System.out.println(person.getAge());
        } catch (AgeNotValidException e) {
            System.out.println("Нельзя сравнивать");
            e.printStackTrace();
        }
    }
}
