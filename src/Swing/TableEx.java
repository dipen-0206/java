package Swing;

import javax.swing.*;
import java.awt.*;

public class TableEx {
    static void main(String[] args) {
        JFrame f1=new JFrame("Table");
        f1.setSize(300,300);
        f1.setLayout(new FlowLayout());
        String []row={"id","name","Address"};
        String [][]cols={{"1","Aayush","balambu"},{"2","aakash","thankot"}};
        JTable t1=new JTable(cols,row);
        JScrollPane p1=new JScrollPane(t1);
        f1.add(p1);



        f1.setVisible(true);
    }
}
