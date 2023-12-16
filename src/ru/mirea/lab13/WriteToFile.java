package ru.mirea.lab13;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите информацию для записи в файл:");
            String input = scanner.nextLine();
            writer.write(input);
            writer.close();
            System.out.println("Информация успешно записана в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}