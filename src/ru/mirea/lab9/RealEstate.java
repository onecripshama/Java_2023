package ru.mirea.lab9;

public class RealEstate implements Priceable {
    private double price;

    public RealEstate(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
