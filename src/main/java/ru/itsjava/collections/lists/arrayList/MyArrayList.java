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
        if (realSize == 0) {
            return true;
        } else {
            return false;
        }
//        return realSize == 0;
    }

    public boolean contains() {
        for (int i = 0; i < realSize; i++) {
            if (array[i] == null) {
                return false;
            }
        }
        return true;
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
        return false;
    }

    public void clear() {
        realSize = realSize / array.length;
    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
//        return "MyArrayList{" + Arrays.toString(array) + '}';
        StringBuilder stringBuilder = new StringBuilder("MyArrayList{");
        for (int i = 0; i < realSize; i++) {
            stringBuilder.append(array[i]).append(" ");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}