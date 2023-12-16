package ru.mirea.lab9;

public class NameableTest {
    public static void main(String[] args) {
        Nameable car = new Car("VAZ");
        System.out.println("Car name: " + car.getName());

        Nameable animal = new Animal("Dog");
        System.out.println("Animal name: " + animal.getName());

        Nameable planet = new Planet("Earth");
        System.out.println("Planet name: " + planet.getName());
    }
}
