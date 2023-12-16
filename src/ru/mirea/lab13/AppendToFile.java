package ru.mirea.lab13;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendToFile {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt", true));
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите текст для добавления в конец файла:");
            String input = scanner.nextLine();
            writer.write(input);
            writer.close();
            System.out.println("Текст успешно добавлен в конец файла.");
        } catch (IOException e) {
            System.out.println("Ошибка при добавлении текста в файл: " + e.getMessage());
        }
    }
}
