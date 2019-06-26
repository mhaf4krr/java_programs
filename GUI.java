import javax.swing.*;
import java.awt.event.*;

public class GUI implements ActionListener{
    JButton button;
    public static void main(String[] args){
        GUI g = new GUI();
        g.go();
    }

    void go(){
        JFrame frame = new JFrame();
        button = new JButton("clickme");
        button.addActionListener(this);
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent b){
        button.setText("I was clicked");
        
    }
}