package ru.itsjava.object;

import lombok.*;

@Data //эта аннотация подключает и гетеры и сетеры
@AllArgsConstructor  //конструктор от всех полей
//конструктор для final полей @RequiredArgsConstructor
//иногда требуются конструкторы по умолчанию тогла пишем - @NoArgsConstructor(используем когда конструктор без аргументов, т.е по умолчанию)
public class Dog {
    private final String nickname;
    private int pawsCount;

//    public Dog(String nickname, int pawsCount) {
//        this.nickname = nickname;
//        this.pawsCount = pawsCount;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Dog)) return false;
//
//        Dog dog = (Dog) o;
//
//        if (pawsCount != dog.pawsCount) return false;
//        return nickname.equals(dog.nickname);
//    }
//
//    @Override
//    public int hashCode() {
//        return nickname.hashCode();
//    }
//
//    @Override
//    public String toString() {
//return "Dog{nickname: " + nickname + "," +
//        " paws: "+ pawsCount + "}"; //возвращаем строковое представление Dog
//    }
}
