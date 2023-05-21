package ru.itsjava.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListHW {
    public static void main(String[] args) {

        //0. Создание списков: (Используя конструктор)
        //а). Создать пустой список книг

        List<Book> bookEmptyList = new ArrayList<>();


        //б). Создать список размером 20

        List<Book> bookList = new ArrayList<>(20);

        Book harryPotter = new Book("Гарри Поттер", "Роулинг", 3000);
        Book lordRings = new Book("Властелин колец", "Толкин", 1300);
        Book greenMile = new Book("Зеленая миля", "Кинг", 500);
        Book oneInBerlin = new Book("Один в Берлине", "Фаллада", 1200);
        Book choice = new Book("Выбор", "Эгер", 400);
        Book pushkin = new Book("Капитанская дочка", "Пушкин", 700);
        Book turgenev = new Book("Отцы и дети", "Тургенев", 600);


        //1. Задачи на вставку элемента:
        //а) Добавить подряд 5 элементов.

        bookList.add(harryPotter);
        bookList.add(lordRings);
        bookList.add(greenMile);
        bookList.add(oneInBerlin);
        bookList.add(choice);


        //б) Добавить шестой элемент в третию позицию. Добавить седьмой элемент в первую позицию.

        bookList.add(1, pushkin);
        bookList.add(0, turgenev);

        System.out.println("Полный список: " + bookList);


        //в) Записать в новый список все элементы предыдущего списка.

        List<Book> newBookList = new ArrayList<>();
        Book kiyosaki = new Book("Богатый папа, бедный папа", "Кийосаки", 450);
        Book puzzle = new Book("Головоломка", "Тилье", 450);
        Book tolstoy = new Book("Война и мир", "Толстой", 900);

        newBookList.add(kiyosaki);
        newBookList.add(puzzle);
        newBookList.add(tolstoy);

        bookList.addAll(newBookList);
        System.out.println("Новый лист: " + bookList);


        //2. Получить элемент по индексу:
        //а). Получить первый элемент (первую книгу в списке)
        //б). Получить последний элемент (последнюю книгу в списке)

        System.out.println("bookList.get(0).getName() = " + bookList.get(0).getName());
        System.out.println("bookList.get(6).getName() = " + bookList.get(6).getName());


        //3. Задачи на удаление элементов: (Используя методы)
        //а) Удалить элемент по значению (книге)
        //б) Удалить элемент по индексу

//        bookList.remove(5);
        bookList.remove(oneInBerlin);
        System.out.println("Лист после удаления одного элемента: " + bookList);


        //4. Проверить наличие элемента
        System.out.println("bookList.contains(oneInBerlin) = " + bookList.contains(oneInBerlin));
        System.out.println("bookList.contains(turgenev) = " + bookList.contains(turgenev));


        //5. Вывод списка:

        for (Book allBooks : bookList) {
            System.out.print(allBooks + "; ");

        }
    }
}
