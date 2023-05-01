package ru.itsjava.collections.lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.itsjava.collections.lists.object.LombokHomeWork;

public class LombokHomeWorkTest {

    @Test
    public void shouldHaveCorrectConstructor() {
        LombokHomeWork actualLombok = new LombokHomeWork("Vvv", 3);


        Assertions.assertEquals("Vvv", actualLombok.getNameLombok());
        Assertions.assertEquals(3, actualLombok.getNumberLombok());
    }
}
