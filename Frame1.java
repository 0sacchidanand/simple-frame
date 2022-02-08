package  com.hubberspot.awtSwing.example;
import java.awt.FlowLayout;
import javax.swing.*;


public class Frame1
{
    JFrame frame;
    JButton button;
    Frame1()
    {
        frame=new JFrame("Welcome to my frame");
        button =new JButton("click me!");
        frame.setSize(200,100);
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Frame1();
    }


}

