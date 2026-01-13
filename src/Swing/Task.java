package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task {
    static void main(String[] args) {
        JFrame f1=new JFrame("task");
        f1.setSize(300,300);
        f1.setLayout(new FlowLayout());
        JLabel l1=new JLabel("num:");
        JTextField t1=new JTextField(10);
        f1.add(l1);f1.add(t1);
        JButton b1=new JButton("square");
        JButton b2=new JButton("cube");
        f1.add(b1);f1.add(b2);
        JLabel l2=new JLabel("output");
        JTextField t2=new JTextField(10);
        f1.add(l2);f1.add(t2);
        f1.setVisible(true);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num=Integer.parseInt(t1.getText());
                t2.setText(String.valueOf(num*num));
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num=Integer.parseInt(t1.getText());
                t2.setText(String.valueOf(num*num*num));
            }
        });

        f1.setVisible(true);
        f1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
