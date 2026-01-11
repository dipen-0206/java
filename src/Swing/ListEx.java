package Swing;

import javax.swing.*;
import java.awt.*;

public class ListEx {
    static void main(String[] args) {
        JFrame f1=new JFrame("List");
        f1.setSize(300,300);
        f1.setLayout(new FlowLayout());
        String []weeks={"sunday","tuesday","wednesday","thursday","friday","saturday"};
        JComboBox c1=new JComboBox(weeks);
        f1.add(c1);
        JList l1=new JList(weeks);
        f1.add(l1);
        f1.setVisible(true);
    }
}
