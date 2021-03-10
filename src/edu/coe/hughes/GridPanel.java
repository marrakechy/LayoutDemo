package edu.coe.hughes;

import javax.swing.*;
import java.awt.*;

public class GridPanel extends JPanel {
    public GridPanel() {
        setLayout(new GridLayout(2,2));
        setBackground(Color.LIGHT_GRAY);

        JButton b1 = new JButton ("Button 1");
        JButton b2 = new JButton ("Button 2");
        JButton b3 = new JButton ("Button 3");
        JButton b4 = new JButton ("Button 4");
        JButton b5 = new JButton ("Button 5");
        JButton b6 = new JButton ("Button 6");
        JButton b7 = new JButton ("Button 7");


        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
    }
}
