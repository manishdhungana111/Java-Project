import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Box extends JPanel implements ActionListener {
int boxX = 250;
int boxY = 200;
JButton btn = new JButton("Move!!!!");
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
       /* g.setColor(Color.RED);
        g.fillRect(10,10,100,100);

        g.setColor(Color.BLUE);
        g.fillRect(100,10,100,100);

        g.setColor(Color.CYAN);
        g.fillRect(200,10,100,100);

        g.setColor(Color.BLACK);
        g.fillRect(300,10,100,100);

        g.setColor(Color.ORANGE);
        g.fillRect(400,10,100,100);

        g.setColor(Color.GREEN);
        g.fillRect(10,110,100,100);

        g.setColor(Color.YELLOW);
        g.fillRect(100,110,100,100);
        g.setColor(Color.RED);
        g.fillRect(200,110,100,100);

        g.setColor(Color.BLACK);
        g.fillRect(300,110,100,100);

        g.setColor(Color.BLUE);
        g.fillRect(400,110,100,100); */

        add(btn);
        btn.setBounds(250,400,100,100);
        btn.addActionListener(this);
        g.setColor(Color.RED);
        g.fillOval(boxX,boxY,50,60);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn){
            boxY-=10;
            repaint();
        }

    }
}
