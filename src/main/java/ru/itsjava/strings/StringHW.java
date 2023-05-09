package ru.itsjava.strings;

public class StringHW {
    public static void main(String[] args) {


        String name = "Masha"; // создали строку  и присвоили имя
        String name2 = "Masha"; //копия Маши

        System.out.println("(name == copyName = ) - " + (name == name2)); //сравнение ссылок на один и тот же объект


        String constName = new String("Masha"); //создание нового объекта не в пуле строк
        System.out.println(constName == name); // сравнение ссылок, выводит false т.к. это разные объекты

        String internName = constName.intern(); //метод intern переводит в пулстрок
        System.out.println(internName == name); //теперь сравниваем, возвращает true т.к. они теперь ссылаются на один и то же объект

        String stroka = "Я люблю джаву!";

        System.out.println("length.length() = " + stroka.length()); //выводит длину строк
        System.out.println("length.isEmpty() = " + stroka.isEmpty()); //проверка на пустоту строк
        System.out.println("stroka.equals(\"Я не люблю джаву!\") = " + stroka.equals("Я не люблю джаву!")); //проверка на идентичность содержания строки
        System.out.println("stroka.equalsIgnoreCase(\"Я люблю джаву!\") = " + stroka.equalsIgnoreCase("Я люблю джаву!")); //игнорирует содержание


        String[] stroki = stroka.split(" "); //разбивает сроку на части
        System.out.println(stroki[0]);
        System.out.println(stroki[1]);
        System.out.println(stroki[2]);


        StringBuilder builderStroka = new StringBuilder(stroka); //конкатенация строк, меняет состояние текущей строки не оздавая новый объект
        for (int i = 0; i < 10; i++) {
            builderStroka.append("но, надо много учиться! ");
        }
        System.out.println(builderStroka.toString());






    }
}
