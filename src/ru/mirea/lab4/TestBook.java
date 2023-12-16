package ru.mirea.lab4;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("John Doe", "The Book", 2022);
        System.out.println("Book author: " + book.getAuthor());
        System.out.println("Book title: " + book.getTitle());
        System.out.println("Year of publication: " + book.getYear());
        book.setYear(2023);
        System.out.println("Updated year of publication: " + book.getYear());
    }
}
