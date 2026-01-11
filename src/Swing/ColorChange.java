package Swing;

import javax.swing.*;
import java.awt.*;

public class ColorChange {
    static void main(String[] args) {
        JFrame f1=new JFrame("Stlying");
        f1.setSize(400,400);
        f1.setLayout(new FlowLayout());
        JLabel l1=new JLabel("Hello");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("times new roman",Font.BOLD,30));
        f1.add(l1);
        JTextField t1=new JTextField(20);
        t1.setForeground(Color.PINK);
        t1.setFont(new Font("times new roman",Font.BOLD,20));
        t1.setBackground(Color.red);
        f1.add(t1);
        f1.setVisible(true);

    }

}
