import javax.swing.*;
import java.awt.*;

public class GUI {
    JFrame frame =new JFrame();


    public void render(){

        frame.setTitle("Aeroplane");
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
       /* frame.setLayout(new BorderLayout());
        ImageIcon imageIcon = new ImageIcon("C:\\PracticeProject\\Aeroplane\\Space");
        JLabel backgroundLabel = new JLabel("Space", imageIcon, JLabel.CENTER);
        frame.setContentPane(backgroundLabel); */

    }
}
