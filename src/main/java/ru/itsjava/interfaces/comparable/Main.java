package ru.itsjava.interfaces.comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Person mother = new Person("Mother", "Ivanova", 40);
        Person father = new Person("Father", "Ivanov", 45);
        Person son = new Person("Son", "Ivanov", 18);
        Person daughter = new Person("Daughter", "Ivanova", 15);


        System.out.println();


        System.out.println("mother.compareTo(father) = " + mother.compareTo(father));
        System.out.println("mother.compareTo(son) = " + mother.compareTo(son));
        System.out.println("mother.compareTo(daughter) = " + mother.compareTo(daughter));
        System.out.println("father.compareTo(mother) = " + father.compareTo(mother));
        System.out.println("father.compareTo(son) = " + father.compareTo(son));
        System.out.println("father.compareTo(daughter) = " + father.compareTo(daughter));
        System.out.println("son.compareTo(mother) = " + son.compareTo(mother));
        System.out.println("son.compareTo(father) = " + son.compareTo(father));
        System.out.println("son.compareTo(daughter) = " + son.compareTo(daughter));
        System.out.println("daughter.compareTo(mother) = " + daughter.compareTo(mother));
        System.out.println("daughter.compareTo(father) = " + daughter.compareTo(father));
        System.out.println("daughter.compareTo(son) = " + daughter.compareTo(son));


        System.out.println();


        Person[] people = {mother, father, son, daughter};
        System.out.println("Arrays.toString(people) = " + Arrays.toString(people));
        Arrays.sort(people);
        System.out.println("Arrays.toString(people) = " + Arrays.toString(people));


        System.out.println();


        Person mother1 = (Person) mother.clone();
        Person father1 = (Person) father.clone();
        Person son1 = (Person) son.clone();
        Person daughter1 = (Person) daughter.clone();


        System.out.println();


        System.out.println("mother = " + mother);
        System.out.println("mother1 = " + mother1);
        System.out.println("father = " + father);
        System.out.println("father1 = " + father1);
        System.out.println("son = " + son);
        System.out.println("son1 = " + son1);
        System.out.println("daughter = " + daughter);
        System.out.println("daughter1 = " + daughter1);
    }
}
