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
        Book sierra = new Book("Изучаем Java", "Сьерра", 600);
        Book ekkel = new Book("Философия Java", "Тургенев", 400);
        Book shieldt = new Book("Java полное руководство", "Тургенев", 800);
        Book sasha = new Book("Java", "Саша", 550);

        //1. Задачи на вставку элемента:
        //а) Добавить подряд 5 элементов.

        bookList.add(harryPotter);
        bookList.add(lordRings);
        bookList.add(greenMile);
        bookList.add(oneInBerlin);
        bookList.add(choice);
        bookList.add(sierra);
        bookList.add(ekkel);
        bookList.add(shieldt);
        bookList.add(sasha);


        //б) Добавить шестой элемент в третию позицию. Добавить седьмой элемент в первую позицию.
        bookList.add(2, pushkin);
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

        //bookList.remove(5);
        bookList.remove(oneInBerlin);
        System.out.println("Лист после удаления одного элемента: " + bookList);


        //4. Проверить наличие элемента
        System.out.println("bookList.contains(oneInBerlin) = " + bookList.contains(oneInBerlin));
        System.out.println("bookList.contains(turgenev) = " + bookList.contains(turgenev));


        //5. Вывод списка:
        System.out.println("Вывод списка:");
        for (Book allBooks : bookList) {
            System.out.print(allBooks + "; ");
        }
        System.out.println();


        //6. Отфильтровать список вернуть записи по некоторому условию:
        // а) Условие на индекс: Индекс делится на 3
        System.out.println("Индекс делится на 3");
        for (int i = 0; i < bookList.size(); i = i + 3) {
            System.out.println(bookList.get(i));
        }
        System.out.println();


        //б) Условие на значение: Вернуть количество книг, которые равны "Java"
//        int num = 0;
//        num = num + 1;
//       System.out.println(num);
        System.out.println("Вернуть количество книг, которые равны Java: ");
        //индекс  0,       1
        //список: философия java, java для начинающих
        int bookCount = 0;
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getName().contains("Java")) {
                bookCount++;
            }
        }
        System.out.println(bookCount);


        System.out.println();

        //7. Пропустить несколько первых элементов
        //а) Пропустить первые 3 книги в списке.
        System.out.println("Пропустить первые 3 книги в списке");
        for (int i = 3; i < bookList.size(); i++) {
            System.out.println(bookList.get(i));
        }

        System.out.println();

        //6 + 7: Пропускаем элементы, которые удовлетворяют некоторому условию
        //а) Пропустить первые 2 книги, которые равные "Java"
        System.out.println("Пропустить первые 2 книги, которые равные Java");
        int bookCount1 = 0;
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getName().contains("Java") && bookCount1 < 2) {
                bookCount1++;
            } else {
                System.out.println(bookList.get(i));
            }
        }
        System.out.println();

        //8. Вернуть первый подходящий элемент:
        //а) Возвращаем первую книгу, длина автора которого делится на 3.
        System.out.println("Возвращаем первую книгу, длина автора которого делится на 3");
        int count = 0;
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getAuthor().length() % 3 == 0 && count == 0) {
                count++;
                System.out.println(bookList.get(i));
            }
        }
        System.out.println();

        //9. Возвращаем все элементы удовлетворяющие условию:
        //а) Возвращаем все книги, длина автора которых делится на 3
        System.out.println("Возвращаем все книги, длина автора которых делится на 3");
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getAuthor().length() % 3 == 0) {
                System.out.println(bookList.get(i));
            }
        }
    }
}




