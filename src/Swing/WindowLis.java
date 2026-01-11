package Swing;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.jar.JarEntry;

public class WindowLis {
    static void main(String[] args) {
        JFrame f1=new JFrame("Windowas Listeners");
        f1.setSize(300,300);
        f1.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Closing");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("closed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("iconified");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("deiconified");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Activated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Deactivated");
            }
        });
        f1.setVisible(true);
    }
}
