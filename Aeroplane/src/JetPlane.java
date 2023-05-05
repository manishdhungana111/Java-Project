import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;

public class JetPlane extends JFrame implements ActionListener {
    private int x, y, width, height, speed;

    public JetPlane() {
        super("JetPlane Model");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);
        x = 50;
        y = 300;
        width = 100;
        height = 50;
        speed = 5;

        // Add key bindings for controlling the jetplane
        InputMap inputMap = this.getRootPane().getInputMap();
        ActionMap actionMap = this.getRootPane().getActionMap();
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_UP, 0), "increaseSpeed");
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0), "decreaseSpeed");
        actionMap.put("increaseSpeed", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                speed += 1;
            }
        });
        actionMap.put("decreaseSpeed", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                speed -= 1;
            }
        });

        // Start the animation timer
        Timer timer = new Timer(10, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Update the jetplane's position based on its speed
        x += speed;
        if (x > getWidth()) {
            x = -width;
        }
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.fillRect(x, y, width, height);
    }

    public static void main(String[] args) {
        new JetPlane();
    }
}
