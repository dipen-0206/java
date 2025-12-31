package Swing;

import javax.swing.*;
import java.awt.*;

public class RegistrationForm {
    static void main(String[] args) {
        JFrame f1=new JFrame("registration From");
        f1.setSize(300,300);
        f1.setLayout(new FlowLayout());
        JLabel l1=new JLabel("Full Name");
        JTextField t1=new JTextField(10);
        f1.add(l1);f1.add(t1);
        JLabel l2=new JLabel("Email");
        JTextField t2=new JTextField(15);
        f1.add(l2);f1.add(t2);
        JLabel l3=new JLabel("Gender");
        ButtonGroup g1=new ButtonGroup();
        JRadioButton r1=new JRadioButton("Male");
        JRadioButton r2=new JRadioButton("FEMale");
        JRadioButton r3=new JRadioButton("Others");
        g1.add(r1);g1.add(r2);g1.add(r3);
        f1.add(l3);f1.add(r1);f1.add(r2);f1.add(r3);
        JLabel l4=new JLabel("Hobbies");
        JCheckBox c1=new JCheckBox("Singing");
        JCheckBox c2=new JCheckBox("Dancing");
        JCheckBox c3=new JCheckBox("Playing");
        f1.add(l4);f1.add(c1);f1.add(c2);f1.add(c3);
        JLabel l5=new JLabel("About You");
        JTextArea a1=new JTextArea(5,20);
        f1.add(l5);f1.add(a1);
        JButton btn=new JButton("Submit");
        f1.add(btn);
        f1.setVisible(true);
    }
}
