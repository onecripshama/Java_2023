package ru.mirea.lab6.task2;

public class BritishBulldog extends Bulldog{
    @Override
    public void run(){
        System.out.println("Speed is 15 km/h");
    }
    @Override
    public void jump(){
        System.out.println("Height of jump is 1.1 meters");
    }
    @Override
    public String getBreed(){
        return "British Bulldog";
    }
}
