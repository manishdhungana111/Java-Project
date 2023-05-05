import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/*public class FlappyBird extends JPanel implements KeyListener, ActionListener {

    private int x = 0;
    private int y = 0;
    private int birdY = 250;
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

    public FlappyBird() {
        JFrame frame = new JFrame("Flappy Bird");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.addKeyListener(this);
        frame.setVisible(true);
        timer = new Timer(20, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.GREEN);
        g.fillRect(0, 550, getWidth(), getHeight() - 550);
        g.setColor(Color.RED);
        g.fillRect(200, birdY, 50, 50);
        g.setColor(Color.BLACK);
        g.drawString("Score: " + score, 10, 20);
        for (int i = 0; i < obstacleX.length; i++) {
            g.setColor(Color.ORANGE);
            g.fillRect(obstacleX[i], obstacleY[i], obstacleWidth, obstacleHeight);
        }
    }

    public static void main(String[] args) {
        new FlappyBird();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < obstacleX.length; i++) {
            obstacleX[i] -= 5;
            if (obstacleX[i] < -obstacleWidth) {
                obstacleX[i] += obstacleX.length * gap;
                obstacleY[i] = (int) (Math.random() * (getHeight() - obstacleHeight - gapPosition)) + gapPosition;
            }
            if (obstacleX[i] == 200) {
                score++;
            }
            if (birdY + 50 > obstacleY[i] && birdY < obstacleY[i] + obstacleHeight
                    && 200 + 50 > obstacleX[i] && 200 < obstacleX[i] + obstacleWidth) {
                timer.stop();
            }
        }
        velocity += gravity;
        birdY += velocity;
        if (birdY > 500) {
            timer.stop();
        }

            repaint();
    }
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch (keyCode) {
            case KeyEvent.VK_UP:
                y -= 100;
                break;
            case KeyEvent.VK_DOWN:
                y += 100;
                break;
            case KeyEvent.VK_LEFT:
                x -= 100;
                break;
            case KeyEvent.VK_RIGHT:
                x += 100;
                break;
        }

        @Override
      //  public void keyPressed (KeyEvent e){
            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                velocity = -20;
            }
        }



    }
} */
