package ru.mirea.lab21;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue()); // Output: 1
        System.out.println(queue.element()); // Output: 2

        queue.enqueue(4);
        queue.enqueue(5);

        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue()); // Output: 2, 3, 4, 5
        }

        System.out.println(queue.isEmpty()); // Output: true

        ArrayQueueModule<Integer> queue2 = new ArrayQueueModule<>();
        queue2.enqueue(1);
        queue2.enqueue(2);
        queue2.enqueue(3);

        System.out.println(queue2.dequeue()); // Output: 1
        System.out.println(queue2.dequeue()); // Output: 2
        System.out.println(queue2.isEmpty()); // Output: false
        System.out.println(queue2.size()); // Output: 1
    }
}
