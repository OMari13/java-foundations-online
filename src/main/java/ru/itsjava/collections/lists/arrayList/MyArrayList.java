package ru.itsjava.collections.lists.arrayList;

public class MyArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private int realSize;
    private Object[] array;

    public MyArrayList() {
        array = new Object[DEFAULT_CAPACITY];
        realSize = 0;
    }

    public int size() {
        return realSize;
    }

    public boolean isEmpty() {
//        for (int i = 0; i < realSize; i++) {
//            if (array[i] != null) {
//                return true;
//            }
//        }
//        return true;
//        if (realSize == 0) {
//            return true;
//        } else {
//            return false;
//        }
        return realSize == 0;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < realSize; i++) {
            if (array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }


    public boolean add(Object o) {
        if (realSize == array.length) {
            Object[] resArray = new Object[array.length * 3 / 2 + 1];
            //копирование массива
            System.arraycopy(array, 0, resArray, 0, array.length);
            array = resArray;
            //вставка нашего элемента

        }
        array[realSize++] = o;
        return true;
    }

    public boolean remove(Object o) {
        int delIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(o)) {
                delIndex = i;
                break;
            }
        }

        if (array.length - 1 - delIndex >= 0) {
            System.arraycopy(array, delIndex + 1, array, delIndex, array.length - 1 - delIndex);
        }

        if (delIndex == -1) {
            return false;
        } else {
            realSize--;
            return true;
        }
    }

    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        realSize = 0;
    }

    public Object get(int index) {
        for (int i = 0; i < realSize; i++) {
            if (index == i) {
                return index;
            }
        }
        return null;
    }

    public Object set(int index, Object element) {
        return array[index] = element;
    }


    public void add(int index, Object element) {  //как-то само получилось с помощью гугла и тыкания))), хочу теперь понять логику
        if (realSize >= array.length) {
            Object[] newArray = new Object[array.length * 3 / 2 + 1];
            //копирование массива
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
            //вставка нашего элемента
        }
        for (int i = realSize; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = element;
        realSize++;
    }


    public Object remove(int index) {
        checkIndex(index);

        Object resElement = array[index];
        if (array.length - 1 - index >= 0) {
            System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
        }
        realSize--;
        return resElement;
    }


    private void checkIndex(int index) {
        if (!isCorrectIndex(index)) {
            throw new ArrayIndexOutOfBoundsException("Некорректый индекс");
        }
    }

    private boolean isCorrectIndex(int index) {
        if ((index > -1) && (index < realSize)) {
            return true;
        }
        return false;
    }

    public int indexOf(Object o) { //получаем индекс первого совпадения
        for (int i = 0; i < realSize; i++) {
            if (array[i].equals(o)) {
                return i;
            }
        }
        return 0;
    }

    public int lastIndexOf(Object o) { //тут тоже возникли вопросы, как-то плучилось вроде бы, но некоторые моменты не понимаю
        int lastIndex = -1;
        for (int i = 0; i < realSize; i++) {
            if (array[i].equals(o)) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }


    @Override
    public String toString() {
//        return "MyArrayList{" + Arrays.toString(array) + '}';
        StringBuilder stringBuilder = new StringBuilder("MyArrayList {");
        for (int i = 0; i < realSize; i++) {
            stringBuilder.append(array[i]).append(" ");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}