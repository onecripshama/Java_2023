package ru.mirea.lab10;
import java.util.Scanner;

public class Main {
    // 1. Треугольная последовательность
    public static void printTriangleSequence(int n) {
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (count > n) {
                    return;
                }
                System.out.print(i + " ");
                count++;
            }
        }
    }

    // 2. От 1 до n
    public static void printNumbersUpToN(int n) {
        if (n > 0) {
            printNumbersUpToN(n - 1);
            System.out.print(n + " ");
        }
    }

    // 3. От A до B
    public static void printNumbersFromAToB(int a, int b) {
        if (a == b) {
            System.out.print(a + " ");
        } else if (a < b) {
            System.out.print(a + " ");
            printNumbersFromAToB(a + 1, b);
        } else {
            System.out.print(a + " ");
            printNumbersFromAToB(a - 1, b);
        }
    }

    // Helper function for task 4
    public static int countDigits(int number) {
        if (number < 10) {
            return 1;
        }
        return 1 + countDigits(number / 10);
    }

    // 4. Заданная сумма цифр
    public static int countNumbersWithSumOfDigits(int k, int s) {
        if (s < k || s > 9 * k) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }
        int count = 0;
        for (int i = (k == countDigits(s) ? 1 : 0); i <= 9; i++) {
            count += countNumbersWithSumOfDigits(k - 1, s - i);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Проверка работы задачи 1
        System.out.println("Enter the value of n for task 1: ");
        int n = scanner.nextInt();
        System.out.println("Triangle sequence:");
        printTriangleSequence(n);

        // Проверка работы задачи 2
        System.out.println("\nEnter the value of n for task 2: ");
        n = scanner.nextInt();
        System.out.println("Numbers from 1 to " + n + ":");
        printNumbersUpToN(n);

        // Проверка работы задачи 3
        System.out.println("\nEnter the values of A and B for task 3: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Numbers from " + a + " to " + b + ":");
        printNumbersFromAToB(a, b);

        // Проверка работы задачи 4
        System.out.println("\nEnter the values of k and s for task 4: ");
        int k = scanner.nextInt();
        int s = scanner.nextInt();
        System.out.println("Number of " + k + "-digit numbers with sum of digits equal to " + s + ":");
        System.out.println(countNumbersWithSumOfDigits(k, s));

        scanner.close();
    }
}
