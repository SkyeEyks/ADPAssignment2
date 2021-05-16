package za.ac.cput;

import java.util.ArrayList;

public class MyBooks {
    private final ArrayList<String> books;

    public MyBooks() {
        books = new ArrayList<>();
    }

    public boolean add(String book) {
        return books.add(book);
    }

    public boolean remove(String book) {
        return books.remove(book);
    }

    public int find(String book) {
        return books.indexOf(book);
    }
}
