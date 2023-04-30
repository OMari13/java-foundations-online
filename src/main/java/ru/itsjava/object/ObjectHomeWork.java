package ru.itsjava.object;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ObjectHomeWork {

    //поля
    private final String streetName;
    private int streetNumber;

    //конструктор
//    public ObjectHomeWork(String streetName, int streetNumber){
//        this.streetName = streetName;
//        this.streetNumber = streetNumber;
//    }
//
//    @Override //метод Object
//    public boolean equals(Object o) { // идет сравнение между объектами. Определяет, равен ли один объект другому
//        if (this == o) return true; // возвращает true если ссылаемся на один и тот же объект
//        if (!(o instanceof ObjectHomeWork)) return false; //если входящий объект не я-я экземпляром ObjectHomeWork возвращает false
//
//        ObjectHomeWork objectHomeWork = (ObjectHomeWork) o; //приводим тип данных
//
//        if(streetNumber != objectHomeWork.streetNumber) return false; //возвращает false если параметры streetNumber не совпадают
//        return streetName.equals(objectHomeWork.streetName); //если совпадают сравниваем со streetName
//    }
//
//    @Override
//    public int hashCode() { //метод hashCode
//        return streetName.hashCode(); //
//    }
}
