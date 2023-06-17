package ru.itsjava.collections.lists;

import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;

public class PersonArrayList {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        Person manNikita = new Person("Никита", 25, true);
        Person manNikifor = new Person("Никифор", 32, true);
        Person manNester = new Person("Нестер", 16, true);
        Person manNikolay = new Person("Николай", 19, true);
        Person womanMariya = new Person("Мария", 30, false);
        Person womanOlga = new Person("Наташа", 26, false);
        Person womanVarvara = new Person("Варвара", 34, false);


        personList.add(manNikita);
        personList.add(manNikifor);
        personList.add(manNester);
        personList.add(manNikolay);
        personList.add(womanMariya);
        personList.add(womanOlga);
        personList.add(womanVarvara);


        //Вернуть всех военнообязанных мужчин (пол), которым меньше 27 и больше 18 и имя которых начинается на 'Н'

        System.out.println("военнообязанные мужчины (пол), которым меньше 27 и больше 18 и имя которых начинается на 'Н'");

        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).isMale() && personList.get(i).getName().contains("Н")
                    && personList.get(i).getAge() < 27 & personList.get(i).getAge() > 18) {
                System.out.println(personList.get(i));
            }
        }
        System.out.println();


        //Найти средний возраст всех женщин.

        System.out.println("Инфо женщин: ");

        int count = 0;
        int sumAge = 0;

        for (int i = 0; i < personList.size(); i++) {
            if (!personList.get(i).isMale()) {
                sumAge = sumAge + personList.get(i).getAge();
                count++;
            }
        }
        int midlAge = sumAge / count;

        System.out.println("Сумма возрастов женщин" + " - " + sumAge);
        System.out.println("Количество женщин" + " - " + count);
        System.out.println("Среднй возраст женщин" + " - " + midlAge);

        System.out.println();


        //Доп задания от Виталия для закрепления
        //Найти сумму возрастов всех мужчин

        System.out.println("Сумма возрастов мужчин");

        int sumAgeMan = 0;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).isMale()) {
                sumAgeMan = sumAgeMan + personList.get(i).getAge();
            }
        }

        System.out.println(sumAgeMan);

        System.out.println();


        //Найти произведение возрастов женщин

        System.out.println("Найти произведение возрастов женщин");


        int ageProWoman = 1;

        for (int i = 0; i < personList.size(); i++) {
            if (!personList.get(i).isMale()) {
                ageProWoman = ageProWoman * personList.get(i).getAge();

            }
        }
        System.out.println(ageProWoman);

        System.out.println();


        //Найти количество мужчин с именем Николай

        System.out.println("Мужчины с именем Николай");

        int countNikolay = 0;

        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getName().equals("Николай")) {
                countNikolay++;
            }
        }
        System.out.println(countNikolay);

        System.out.println();


        //Найти количество мужчин и женщин в одном цикле

        System.out.println("Количество мужчин и женщин в одном цикле");

        int countWoman = 0;
        int countMan = 0;

        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).isMale()) {
                countMan++;
            } else {
                countWoman++;
            }
        }
        System.out.println(countMan);
        System.out.println(countWoman);
        System.out.println("personList.size() = " + personList.size());
    }
}




