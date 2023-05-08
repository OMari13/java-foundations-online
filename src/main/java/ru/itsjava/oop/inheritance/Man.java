package ru.itsjava.oop.inheritance;

public class Man implements Talkable, Eatable{

    @Override
    public void talk(){
        System.out.println("Talk man");
    }

    @Override
    public void eat(){
        System.out.println("Eat man");
    }
}
