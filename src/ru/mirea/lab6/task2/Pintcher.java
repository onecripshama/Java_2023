package ru.mirea.lab6.task2;

public class Pintcher extends Dog {
    @Override
    public void run(){
        System.out.println("Speed is 20 km/h");
    }

    @Override
    public String getBreed() {
        return "Pintcher";
    }

    @Override
    public void jump() {
        System.out.println("Height of jump is 1.5 meters");
    }
}




