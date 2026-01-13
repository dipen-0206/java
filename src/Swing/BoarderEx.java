package Swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BoarderEx {
    static void main(String[] args) {
        JFrame f1=new JFrame("Sing Border Example");
        f1.setSize(600,600);
        JPanel p1=new JPanel();
        Border b1=BorderFactory.createLineBorder(Color.BLUE, 2);
        p1.setBorder(b1);
        p1.add(new JLabel("Hello SWing Border"));
        f1.add(p1);
        f1.setVisible(true);
    }
}
