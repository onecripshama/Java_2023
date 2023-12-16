package ru.mirea.lab6.task1;

public class TestDish {
    public static void main(String[] args)
    {
        Dish p = new Plate();
        Dish g = new Glass();
        System.out.println(p.getType() + " " + p.color + " " + p.mealVolume + "g");
        System.out.println(g.getType() + " " + g.color + " " + g.mealVolume + "g");
    }

}
