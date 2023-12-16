package ru.mirea.lab7;
import javax.swing.*;
import java.awt.*;

public class Practice4 extends JFrame {
    private JPanel panel1;
    private JButton ACMilanButton;
    private JButton realMadridButton;
    private JLabel lastScoreLabel;
    private JLabel resLabel;
    private JLabel winLabel;
    private int mil = 0, rea = 0;

    private Practice4() {
        panel1 = new JPanel();
        ACMilanButton = new JButton("AC Milan");
        realMadridButton = new JButton("Real Madrid");
        lastScoreLabel = new JLabel("Last Score: ");
        resLabel = new JLabel("Result: ");
        winLabel = new JLabel("Winner: ");

        panel1.setLayout(new GridLayout(2, 2));
        panel1.add(ACMilanButton);
        panel1.add(realMadridButton);
        panel1.add(lastScoreLabel);
        panel1.add(resLabel);
        panel1.add(winLabel);

        setContentPane(panel1);
        setSize(500, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        ACMilanButton.addActionListener(e -> {
            mil++;
            upd("AC Milan");
        });

        realMadridButton.addActionListener(e -> {
            rea++;
            upd("Real Madrid");
        });
    }

    private void upd(String last) {
        lastScoreLabel.setText("Last Score: " + last);
        resLabel.setText("Result: " + mil + " X " + rea);
        String w = "DRAW";
        if (mil > rea)
            w = "AC Milan";
        else if (rea > mil)
            w = "Real Madrid";
        winLabel.setText("Winner: " + w);
    }

    public static void main(String[] args) {
        new Practice4();
    }
}