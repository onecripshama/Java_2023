package ru.mirea.lab12;

import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class CardGame3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.next();
        String input2 = scanner.next();
        Deque<Integer> player1 = new ArrayDeque<>();
        Deque<Integer> player2 = new ArrayDeque<>();

        for (int i = 4; i >= 0; i--) {
            player1.addFirst(Character.getNumericValue(input1.charAt(i)));
            player2.addFirst(Character.getNumericValue(input2.charAt(i)));
        }

        int moves = 0;
        while (moves < 106 && !player1.isEmpty() && !player2.isEmpty()) {
            int card1 = player1.pollLast();
            int card2 = player2.pollLast();
            if (card1 == 0 && card2 == 9) {
                player1.addFirst(card1);
                player1.addFirst(card2);
            } else if (card1 == 9 && card2 == 0) {
                player2.addFirst(card1);
                player2.addFirst(card2);
            } else if (card1 > card2) {
                player1.addFirst(card1);
                player1.addFirst(card2);
            } else {
                player2.addFirst(card1);
                player2.addFirst(card2);
            }
            moves++;
        }

        if (player1.isEmpty()) {
            System.out.println("first " + moves);
        } else if (player2.isEmpty()) {
            System.out.println("second " + moves);
        } else {
            System.out.println("botva");
        }
    }
}
