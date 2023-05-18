package ru.itsjava.exceptions;

public class main {
    public static void main(String[] args) {

        Person person = new Person("Masha", 18);

        try {
            System.out.println(person.getAge());
        } catch (AgeNotValidException e) {
            System.out.println("Нельзя делить");
            e.printStackTrace();
        }
    }
}
