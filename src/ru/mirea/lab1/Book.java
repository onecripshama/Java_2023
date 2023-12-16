package ru.mirea.lab1;

public class Book
{
    private String name;
    private int year;
    public Book(String n, int a){
        name = n;
        year = a;
    }
    public Book(String n){
        name = n;
        year = 0;
    }
    public Book(){
        name = "Kolobok";
        year = 1955;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getYear() {
        return year;
    }
    public String toString(){
        return this.name+", year "+this.year;
    }
    public void AgeOfBook(){
        System.out.println(name+" was published "+(2023-year)+" years ago");
    }
}
