package org.example;

public class Book {
    private int id;
    private String title;
    private String author;
    private boolean available;

    Book() {
        this.id = -1;
        this.title = "";
        this.author = "";
        this.available = false;
    }

    Book(int id, String title, String author, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = available;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return available; }

    public void setId(int id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setAvailable(boolean available) { this.available = available; }

    @Override
    public String toString() {
        return String.format("ID: %d. Title: %s. Author: %s. Available: %b.", id, title, author, available);
    }
}
