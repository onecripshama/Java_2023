package ru.mirea.lab13;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReplaceInFile {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите новую информацию для замены в файле:");
            String input = scanner.nextLine();
            writer.write(input);
            writer.close();
            System.out.println("Информация успешно заменена в файле.");
        } catch (IOException e) {
            System.out.println("Ошибка при замене информации в файле: " + e.getMessage());
        }
    }
}
