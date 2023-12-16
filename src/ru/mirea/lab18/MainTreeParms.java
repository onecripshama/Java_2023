package ru.mirea.lab18;

public class MainTreeParms {
    public static void main(String[] args) {
        ThreeParameters<Integer, Animal, String> threeParams = new ThreeParameters<>(42, new Animal("Lion", 5), "Hello");

        Integer firstParam = threeParams.getFirstParam();
        Animal secondParam = threeParams.getSecondParam();
        String thirdParam = threeParams.getThirdParam();

        System.out.println("First Parameter: " + firstParam);
        System.out.println("Second Parameter: " + secondParam);
        System.out.println("Third Parameter: " + thirdParam);
        System.out.println();
        threeParams.printClassNames();

    }
}