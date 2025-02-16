package org.example;

import java.util.HashMap;

public class Library {
    private final HashMap<Integer, Book> books;

    Library(Book... books) {
        this.books = new HashMap<>();
        for (Book book : books) {
            this.books.put(book.getId(), book);
        }
    }

    public void addBook(Book book) {
        if (books.containsKey(book.getId())) {
            System.out.println("Book already exists");
            return;
        }
        books.put(book.getId(), book);
        System.out.println("\tBook added");
    }

    public void removeBook(int id) {
        if (!books.containsKey(id)) {
            System.out.println("Book does not exist");
            return;
        }
        books.remove(id);
        System.out.println("\tBook removed");
    }

    public void setBookAvailability(int id, boolean availability) {
        if (!books.containsKey(id)) {
            System.out.println("Book does not exist");
            return;
        }
        books.get(id).setAvailable(availability);
        System.out.println("\tBook availability set");
    }

    public void printBooksFilter(boolean availability) {
        int counter = 0;

        for (Book book : books.values()) {
            if (book.isAvailable() == availability) {
                counter++;
                System.out.println("\t" + book);
            }
        }

        if (counter == 0) {
            if (availability) {
                System.out.println("\tNo available books");
            } else {
                System.out.println("\tAll books are available");
            }
        }
    }

    @Override
    public String toString() {
        if (books.isEmpty()) { return "\tEmpty library"; }

        for (Book book : books.values()) {
            System.out.println("\t" + book);
        }

        return "";
    }
}
