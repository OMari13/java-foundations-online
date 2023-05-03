package ru.itsjava.collections.lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Класс Person должен: ")
public class PersonTest {


    private static final String DEFAULT_NAME = "Наташа";
    private static final int DEFAULT_AGE = 15;
    private static final String NEW_NAME = "Та же Наташа";
    private static final int NEW_AGE = 20;



    @DisplayName(" корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstructor() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);

        Assertions.assertAll("actualPerson", () -> Assertions.assertEquals(DEFAULT_NAME, actualPerson.getName()),
                () -> Assertions.assertEquals(DEFAULT_AGE, actualPerson.getAge()));
    }

    @DisplayName("корректно выводит возраст")
    @Test
    public void shouldHaveCorrectBirthday() {

        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        actualPerson.setAge(DEFAULT_AGE + 1);
        Assertions.assertEquals(DEFAULT_AGE + 1, actualPerson.getAge());

    }

    @DisplayName("корректно проверяет возраст")
    @Test
    public void shouldHaveCorrectTakeBeer() {
        Person actualPerson = new Person(DEFAULT_NAME, DEFAULT_AGE);
        Person newPerson = new Person(NEW_NAME, NEW_AGE);

        Assertions.assertFalse(actualPerson.takeBeer());
        Assertions.assertTrue(newPerson.takeBeer());



    }
}
