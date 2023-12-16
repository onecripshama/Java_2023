package ru.mirea.lab21;

public class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Предусловие: размер очереди меньше её вместимости
    // Постусловие: элемент добавлен в конец очереди
    public void enqueue(int item) {
        if (rear == queue.length - 1) {
            rear = -1;
        }
        queue[++rear] = item;
        size++;
    }

    // Предусловие: очередь не пустая
    // Постусловие: первый элемент очереди не изменяется
    public int element() {
        return queue[front];
    }

    // Предусловие: очередь не пустая
    // Постусловие: первый элемент очереди удален и возвращен
    public int dequeue() {
        int temp = queue[front++];
        if (front == queue.length) {
            front = 0;
        }
        size--;
        return temp;
    }

    // Постусловие: возвращается текущий размер очереди
    public int size() {
        return size;
    }

    // Постусловие: возвращается true, если очередь пустая, иначе - false
    public boolean isEmpty() {
        return size == 0;
    }

    // Постусловие: очередь очищена (размер становится равным 0)
    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
    }
}
