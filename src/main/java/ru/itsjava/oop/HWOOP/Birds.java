package ru.itsjava.oop.HWOOP;

public class Birds {
    private final String name;
    private final boolean colorBlack;

    public Birds(String name, boolean colorBlack) {
        this.name = name;
        this.colorBlack = colorBlack;
    }

    public String getBirds() { //почему именно стринг?
        return name + colorBlack;
    }
}

