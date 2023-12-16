package ru.mirea.lab4;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Radius of the circle: " + circle.getRadius());
        circle.setRadius(7.0);
        System.out.println("New radius of the circle: " + circle.getRadius());
    }
}
