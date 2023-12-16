package ru.mirea.lab8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main extends JFrame {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int NUM_SHAPES = 20;

    private final Shape[] shapes;

    public Main() {
        super("Random shapes");
        setSize(WIDTH, HEIGHT);
        setVisible(true);

        shapes = new Shape[NUM_SHAPES];
        generateRandomShapes();
    }

    private void generateRandomShapes() {
        Random random = new Random();
        for (int i = 0; i < NUM_SHAPES; i++) {
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            int x = random.nextInt(WIDTH);
            int y = random.nextInt(HEIGHT);
            if (random.nextBoolean()) {
                int width = random.nextInt(100) + 50;
                int height = random.nextInt(100) + 50;
                shapes[i] = new Rectangle(x, y, width, height, color);
            } else {
                int radius = random.nextInt(50) + 25;
                shapes[i] = new Circle(x, y, radius, color);
            }
        }
    }

    public void paint(Graphics g) {
        try {
            TimeUnit.MILLISECONDS.sleep(50);
            for (Shape shape : shapes) {
                shape.draw(g);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        new Main();
    }

}

