package ru.itsjava.collections.lists;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person {

    private String name;
    private int age;

    public void birthday() {
        age++;
    }

    public boolean takeBeer() {
        if (age > 18) return true;
        return false;
    }
}

