package ru.mirea.lab16;
import java.util.Scanner;

public class ex4 {
    public void exceptionDemo() {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
        catch(Exception e) {
            System.out.println("Exception happened!");
        }
        finally { //добавили ко 2 номеру
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        ex4 e2 = new ex4();
        e2.exceptionDemo();
    }
}
