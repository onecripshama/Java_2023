package ru.mirea.lab6.task1;

public class Glass extends Dish {
    public Glass(){
        color = "Transparent";
        mealVolume = 200;
    }
    @Override
    public String getType() { return "Glass";}
}
