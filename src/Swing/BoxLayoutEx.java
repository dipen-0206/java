package Swing;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutEx {
    static void main(String[] args) {
        Frame f1=new Frame();
        f1.setLayout(new BoxLayout(f1,BoxLayout.X_AXIS));
        f1.setSize(300,300);
        Button b1=new Button("btn1");
        Button b2=new Button("btn2");
        Button b3=new Button("btn3");
        Button b4=new Button("btn4");
        Button b5=new Button("btn5");
        f1.add(b1);f1.add(b2);f1.add(b3);f1.add(b4);f1.add(b5);
        f1.setVisible(true);
    }
}
