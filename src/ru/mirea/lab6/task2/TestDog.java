package ru.mirea.lab6.task2;

public class TestDog {
    public static void main(String[] args){
        Dog bb = new BritishBulldog();
        Dog b = new Bulldog();
        Dog p = new Pintcher();

        System.out.println(p.getBreed());
        System.out.println(b.getBreed());
        System.out.println(bb.getBreed());
    }
}
