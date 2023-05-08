package ru.itsjava.interfaces.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Comparable<Person>, Cloneable {
    private final String name;
    private final String fullName;
    private int age;


    @Override
    public int compareTo(Person person) {
        int comp = this.fullName.compareTo(person.fullName);
        if (comp == 0) {
            comp = this.name.compareTo(person.name);
            if (comp == 0) {
                comp = age - person.age;
            }
        }
        return comp;
    }

    @Override
    public String toString() {
        return "Person{ " + name + ", "
                + fullName + ", " + age + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

