package ru.mirea.lab8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class Main3 extends JFrame {

    private BufferedImage[] frames;
    private int currentFrameIndex;
    private int frameWidth;
    private int frameHeight;
    private int animationDelay;

    public Main3(String imagePath, int numFrames, int frameWidth, int frameHeight, int animationDelay) {
        super("Animation Viewer");
        setSize(frameWidth, frameHeight);
        setVisible(true);

        frames = new BufferedImage[numFrames];
        currentFrameIndex = 0;
        this.frameWidth = frameWidth;
        this.frameHeight = frameHeight;
        this.animationDelay = animationDelay;

        try {
            BufferedImage spriteSheet = ImageIO.read(new File(imagePath));
            for (int i = 0; i < numFrames; i++) {
                frames[i] = spriteSheet.getSubimage(i * frameWidth, 0, frameWidth, frameHeight);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        startAnimation();
    }

    private void startAnimation() {
        Thread animationThread = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(animationDelay);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    currentFrameIndex = (currentFrameIndex + 1) % frames.length;
                    repaint();
                }
            }
        });
        animationThread.start();
    }

    public void paint(Graphics g) {
        try {
            TimeUnit.MILLISECONDS.sleep(50);
            g.drawImage(frames[currentFrameIndex], 0, 0, null);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        if (args.length < 5) {
            System.out.println("Usage: java Main3 <image_path> <num_frames> <frame_width> <frame_height> <animation_delay>");
            System.exit(1);
        }

        String imagePath = args[0];
        int numFrames = Integer.parseInt(args[1]);
        int frameWidth = Integer.parseInt(args[2]);
        int frameHeight = Integer.parseInt(args[3]);
        int animationDelay = Integer.parseInt(args[4]);

        new Main3(imagePath, numFrames, frameWidth, frameHeight, animationDelay);

    }
}
