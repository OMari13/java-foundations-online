package ru.itsjava.oop.inheritance;

public class Plant implements Talkable, Eatable{

    @Override
    public void talk(){
        System.out.println("Talk plant");
    }

    @Override
    public void eat(){
        System.out.println("Eat plant");
    }
}
