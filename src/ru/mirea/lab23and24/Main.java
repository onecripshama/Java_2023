package ru.mirea.lab23and24;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws OrderAlreadyException {
        ArrayList<String> dish = new ArrayList<>();
        dish.add("Pizza: Peperoni: 590");
        dish.add("Cake: Chocolate: 700");
        ArrayList<String> drink = new ArrayList<>();
        drink.add("Water: Sparkling: 160");
        drink.add("Juice: Orange, Apple: 190");
        System.out.println("Menu: ");
        for (String s: dish)
            System.out.println(s);
        for (String s: drink)
            System.out.println(s);

        RestaurantOrder restaurantOrder = new RestaurantOrder();
        restaurantOrder.addPosition(new Dish("Pizza", "Pepperoni", 590));
        restaurantOrder.addPosition(new Drink("Juice", "Apple", 190));
        System.out.println("\npositions in the order: " + restaurantOrder.count());
        System.out.println("summ of the order: " + restaurantOrder.costAll());
        System.out.println(Arrays.toString(restaurantOrder.getDishes()));

        RestaurantOrder restaurantOrder1 = new RestaurantOrder();
        restaurantOrder1.addPosition(new Dish("Cake", "Chocolate", 700));
        restaurantOrder1.addPosition(new Drink("Water", "Sparkling", 160));
        System.out.println("\npositions in the order: " + restaurantOrder1.count());
        System.out.println("summ of the order: " + restaurantOrder1.costAll());
        System.out.println(Arrays.toString(restaurantOrder1.getDishes()));

        System.out.println("\n" + "Restaurant orders: ");
        OrderManager orderManager = new OrderManager();
        orderManager.add(restaurantOrder, 1);
        orderManager.add(restaurantOrder1, 2);
        System.out.println(orderManager.orders());

        InternetOrder internetOrder = new InternetOrder();
        internetOrder.addPosition(new Dish("Cake", "Chocolate", 700));
        internetOrder.addPosition(new Drink("Water", "Sparkling", 160));

        System.out.println("Internet order: ");
        orderManager.add(internetOrder, "Vernadskogo 78");
        System.out.println(orderManager.getInternetOrder());

    }
}