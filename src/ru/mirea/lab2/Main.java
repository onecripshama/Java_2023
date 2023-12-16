package ru.mirea.lab2;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // 1. Вывести на экран сумму чисел массива с помощью циклов for, while, do while.
        int[] array = {1, 2, 3, 4, 5};
        int sumFor = 0;
        for (int i = 0; i < array.length; i++) {
            sumFor += array[i];
        }
        System.out.println("Sum using for loop: " + sumFor);

        int sumWhile = 0;
        int index = 0;
        while (index < array.length) {
            sumWhile += array[index];
            index++;
        }
        System.out.println("Sum using while loop: " + sumWhile);

        int sumDoWhile = 0;
        int idx = 0;
        do {
            sumDoWhile += array[idx];
            idx++;
        } while (idx < array.length);
        System.out.println("Sum using do-while loop: " + sumDoWhile);

        // 2. Вывести на экран аргументы командной строки в цикле for.
        for (String arg : args) {
            System.out.println(arg);
        }

        // 3. Вывести на экран первые 10 чисел гармонического ряда.
        for (int i = 1; i <= 10; i++) {
            System.out.print(1.0 / i + " ");
        }
        System.out.println();

        // 4. Сгенерировать массив целых чисел случайным образом, вывести его на экран, отсортировать его, и снова вывести на экран.
        int[] randomArray = new int[5];
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100);
        }
        System.out.println("Random array: " + Arrays.toString(randomArray));
        Arrays.sort(randomArray);
        System.out.println("Sorted array: " + Arrays.toString(randomArray));

        // 5. Создать метод, вычисляющую факториал числа с помощью цикла, проверить работу метода.
        int number = 5;
        System.out.println("Factorial of " + number + " is " + factorial(number));
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
