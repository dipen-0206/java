package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemLisEx {
    static void main(String[] args) {
        JFrame f1=new JFrame("Item Listener");
        f1.setSize(300,300);
        f1.setLayout(new FlowLayout());
        f1.add(new JLabel("Programming "));
        JCheckBox c1=new JCheckBox("c");
        JCheckBox c2=new JCheckBox("Java");
        JLabel l1=new JLabel() ;
        c1.addItemListener(new ItemListener() {

                               public void itemStateChanged(ItemEvent e) {
                                   if (c1.isSelected()) {
                                       l1.setText("c selected");
                                   }
                               }
                           }
        );
        c2.addItemListener(new ItemListener() {

                               public void itemStateChanged(ItemEvent e) {
                                   if (c2.isSelected()) {
                                       l1.setText("Java selected");
                                   }
                               }
                           }
        );
    }
}
