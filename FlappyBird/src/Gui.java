import javax.swing.*;

public class Gui {
    JFrame frame = new JFrame();
    Box box = new Box();
    void render(){




        frame.add(box);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Project");
        frame.setSize(500,500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
