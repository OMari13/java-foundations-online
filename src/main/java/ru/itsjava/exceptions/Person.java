package ru.itsjava.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {

    public String name;
    public int age;
    public int getAge() {

        try {
            return age/0;
        }
        catch (ArithmeticException arithmeticException) {
            throw new AgeNotValidException("Возраст нельзя делить на ноль");
        }
    }
}
