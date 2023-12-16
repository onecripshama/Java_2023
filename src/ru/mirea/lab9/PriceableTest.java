package ru.mirea.lab9;

public class PriceableTest {
    public static void main(String[] args) {
        Priceable product = new Product(50.0);
        System.out.println("Product price: $" + product.getPrice());

        Priceable realEstate = new RealEstate(500000.0);
        System.out.println("Real estate price: $" + realEstate.getPrice());
    }
}
