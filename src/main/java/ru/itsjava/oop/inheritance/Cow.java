package ru.itsjava.oop.inheritance;

public class Cow implements Talkable, Eatable{

    @Override
    public void talk(){
        System.out.println("Talk cow");
    }

    @Override
    public void eat(){
        System.out.println("Eat cow");
    }
}
