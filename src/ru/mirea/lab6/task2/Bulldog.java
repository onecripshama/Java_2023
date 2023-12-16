package ru.mirea.lab6.task2;

public class Bulldog extends Dog{
    @Override
    public void run() {
        System.out.println("Speed is 30 km/h");
    }
    @Override
    public void jump() {
        System.out.println("Height of jump is 2.4 meters");
    }
    @Override
    public String getBreed() {
        return "Bulldog";
    }
}
