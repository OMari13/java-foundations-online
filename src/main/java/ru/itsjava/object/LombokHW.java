package ru.itsjava.object;

public class LombokHW {
    public static void main(String[] args) {

        LombokHomeWork lombok = new LombokHomeWork("Vvv", 3);

        LombokHomeWork lombok2 = new LombokHomeWork("Aaa", 4);
        LombokHomeWork lombok3 = new LombokHomeWork("Aaa", 4);

        System.out.println("lombok.equals(lombok2) = " + lombok.equals(lombok2));
        System.out.println("lombok2.equals(lombok3) = " + lombok2.equals(lombok3));

        System.out.println("lombok.toString() = " + lombok.toString());
    }
}
