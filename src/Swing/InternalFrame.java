package Swing;

import javax.swing.*;

public class InternalFrame {
    static void main(String[] args) {
        JFrame f1=new JFrame("Internal Frame");
        f1.setSize(600,400);
        JDesktopPane p1=new JDesktopPane();
        JInternalFrame i1=new JInternalFrame("internal frame 1",
                true,
                true,
                true,
                true);
        i1.setSize(100,100);
        i1.setLocation(50,50);
        i1.setVisible(true);
        p1.add(i1);

        JInternalFrame i2=new JInternalFrame("internal frame 1",
                true,
                true,
                true,
                true);
        i2.setSize(100,100);
        i2.setLocation(100,100);
        i2.setVisible(true);
        p1.add(i2);

        f1.add(p1);
        f1.setVisible(true);
    }
}
