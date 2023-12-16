package ru.mirea.lab1;

import ru.mirea.lab1.Ball;

public class TestBall
{
    public static void main(String[] args)
    {
        Ball b1 = new Ball("Adidas", 21);
        Ball b2 = new Ball("Kappa", 25);
        Ball b3 = new Ball("Nike"); b3.setRadius(19);
        System.out.println(b1);
        b1.Diameter();
        b2.Diameter();
        b3.Diameter();
    }
}
