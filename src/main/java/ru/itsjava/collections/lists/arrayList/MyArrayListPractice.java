package ru.itsjava.collections.lists.arrayList;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListPractice {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println("пустой лист " + list.size());
        list.add("Привет");
        list.add("Пока");
        System.out.println("после добавления двух элементов размер равен = "
                + list.size());
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        list.add("Пока");
        System.out.println("list.size() = " + list.size());

        System.out.println(list);

        System.out.println("list.isEmpty " + list.isEmpty());

        System.out.println("list.contains() = " + list.contains());

        list.clear();
        System.out.println("Лист после удаления " + list);


//        List<String> list2 = new ArrayList<>();
//        list2.add("Привет!");
//        list2.remove("Привет!");
//
//        System.out.println("list2.isEmpty() = " + list2.isEmpty());
//
//        Object[] array = new Object[10];
//        array = null;
//        System.out.println("(array == null) = " + (array == null));
//
//        System.out.println("array.length = " + array.length);
//        System.out.println("array[0] = " + array[0]);


    }
}
