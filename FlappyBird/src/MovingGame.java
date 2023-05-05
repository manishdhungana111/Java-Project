import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class MovingGame extends JPanel implements KeyListener {

    private int x = 200;
    private int y = 200;
    private int velocity = 0;
    private int gravity = 2;
    private int score = 0;
    private int gap = 150;
    private int gapPosition = 300;
    private int[] obstacleX = {500, 750, 1000};
    private int[] obstacleY = {0, 0, 0};
    private int obstacleWidth = 100;
    private int obstacleHeight = 200;
    private Timer timer;

    public MovingGame() {




        JFrame frame = new JFrame("Moving Game");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.addKeyListener(this);
        frame.setLocationRelativeTo(null);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(x, y, 50, 50);
    }

    public static void main(String[] args) {
        new MovingGame();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch(keyCode) {
            case KeyEvent.VK_UP:
                y -= 50;
                break;
            case KeyEvent.VK_DOWN:
                y += 50;
                break;
            case KeyEvent.VK_LEFT:
                x -= 50;
                break;
            case KeyEvent.VK_RIGHT :
                x += 50;
                break;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

}
