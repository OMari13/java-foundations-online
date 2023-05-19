package ru.itsjava.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public class Person {

    private String name;
    private int age;

    public int getAge() {
        if (age < 0 || age > 150)  throw new AgeNotValidException("Возраст некорректен");
        return age;
    }
}