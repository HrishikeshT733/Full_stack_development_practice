package com.labmanual2;

import javax.swing.*;
import java.awt.*;

public class ScrollingBanners extends JFrame implements Runnable {
    private int x1 = 0;
    private int x2;
    private final int Y1 = 50;
    private final int Y2 = 100;
    private final int SPEED = 5;
    private final int WIDTH = 500;
    private final int HEIGHT = 200;
    private boolean running = true;

    public ScrollingBanners() {
        setTitle("Scrolling Banners");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        x2 = WIDTH;
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.RED);
        g.drawString("Scrolling Left", x1, Y1);
        g.setColor(Color.BLUE);
        g.drawString("Scrolling Right", x2, Y2);
    }

    @Override
    public void run() {
        while (running) {
            x1 += SPEED;
            x2 -= SPEED;
            if (x1 > WIDTH) x1 = -100;
            if (x2 < -100) x2 = WIDTH;
            repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new ScrollingBanners();
    }
}
