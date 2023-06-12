package ru.itsjava.collections.lists;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {

    private String name;
    private String author;
    private int pages;

}
