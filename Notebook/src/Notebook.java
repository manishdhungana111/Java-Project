import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Notebook extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JTextArea _textArea = new JTextArea() ;
    JButton button = new JButton("Save");

    public void GUI(){
        frame.setTitle("NoteBook");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);

        frame.add(button);
        button.setBounds(300,300,100,50);
        button.addActionListener(this);


    }
    public void textarea(){
        _textArea.setBounds(0,200,300,400);
        _textArea.setFont(new Font("Serif",Font.BOLD,18));
       frame.add(_textArea);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // File file = new File("SavedData.txt");
        if (e.getSource()== button) {
            try {
                FileWriter writer = new FileWriter("Data.txt");
                String giveData;
                giveData = _textArea.getText();
                writer.write(giveData);
                writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }

    }
}
