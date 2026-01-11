package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerEx {
    static void main(String[] args) {


        JFrame f1 = new JFrame("Mouse");
        f1.setSize(400,400);
        f1.setLayout(new FlowLayout());
        JLabel l1=new JLabel();
        JButton b1=new JButton("Click me");
        b1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                l1.setText("Clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                l1.setText("Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                l1.setText("REleased");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                l1.setText("Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                l1.setText("Exicted");
            }
        });
        f1.add(l1);f1.add(b1);
        f1.setVisible(true);
    }
}