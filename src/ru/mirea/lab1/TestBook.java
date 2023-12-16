package ru.mirea.lab1;

import ru.mirea.lab1.Book;

public class TestBook
{
    public static void main(String[] args) {
        Book bk1 = new Book("Crime and Punishment", 1866);
        Book bk2 = new Book("The Master and Margarita", 1966);
        Book bk3 = new Book("Oblomov"); bk3.setYear(1859);
        System.out.println(bk1);
        bk1.AgeOfBook();
        bk2.AgeOfBook();
        bk3.AgeOfBook();
    }
}
