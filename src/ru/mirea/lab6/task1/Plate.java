package ru.mirea.lab6.task1;

public class Plate extends Dish {
    public Plate(){
        color = "White";
        mealVolume = 400;
    }
    @Override
    public String getType() { return "Plate"; }
}
