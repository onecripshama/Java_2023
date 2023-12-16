package ru.mirea.lab17.task1;
import java.util.Scanner;

public class INNValidator {
    public static boolean isValidInn(String inn) {
        if (inn == null || inn.length() != 12) {
            return false;
        }

        int[] coefficients = {7, 2, 4, 10, 3, 5, 9, 4, 6, 8};
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            sum += (inn.charAt(i) - '0') * coefficients[i];
        }

        int remainder = sum % 11;
        if (remainder == 10) {
            sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += (inn.charAt(i) - '0') * coefficients[i + 1];
            }
            remainder = sum % 11;
        }

        return remainder == (inn.charAt(10) - '0');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Tax ID (INN): ");
        String inn = scanner.nextLine();

        if (isValidInn(inn)) {
            System.out.println("The Tax ID (INN) is valid.");
        } else {
            System.out.println("The Tax ID (INN) is not valid.");
        }
    }
}

