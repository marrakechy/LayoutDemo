package edu.coe.hughes;

import javax.swing.*;
import java.awt.*;

public class BoxPanel extends JPanel {
    public BoxPanel() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.LIGHT_GRAY);

        JButton b1 = new JButton ("Button 1");
        JButton b2 = new JButton ("Button 2");
        JButton b3 = new JButton ("Button 3");
        JButton b4 = new JButton ("Button 4");
        JButton b5 = new JButton ("Button 5");
        JButton b6 = new JButton ("Button 6");

        add(b1);
        add(b2);
        add(Box.createRigidArea(new Dimension(0,10)));
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }
}