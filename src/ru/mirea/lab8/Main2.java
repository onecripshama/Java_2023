package ru.mirea.lab8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class Main2 extends JFrame {
    private BufferedImage image;

    public Main2(String imagePath) {
        super("Image Viewer");
        setSize(1280, 1280 );
        setVisible(true);

        try {
            image = ImageIO.read(new File(imagePath));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void paint(Graphics g) {
        try {
            TimeUnit.MILLISECONDS.sleep(50);
            if (image != null) {
                g.drawImage(image, 0, 0, null);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java Main2 <image_path>");
            System.exit(1);
        }
        new Main2(args[0]);
    }

}

