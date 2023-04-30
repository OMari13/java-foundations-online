package ru.itsjava.object;

public class ObjectHW {
    public static void main(String[] args) {
        ObjectHomeWork myHome = new ObjectHomeWork("Ленина", 55);

        ObjectHomeWork yourHome = new ObjectHomeWork("Невский проспект", 1);
        ObjectHomeWork theirHome = new ObjectHomeWork("Невский проспект", 1);

        System.out.println("myHome.equals(yourHome) = " + myHome.equals(yourHome));
        System.out.println("yourHome.equals(theirHome) = " + yourHome.equals(theirHome));

        System.out.println("myHome.toString() = " + myHome);
    }
}
