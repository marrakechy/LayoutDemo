package edu.coe.hughes;

import javax.swing.*;
import java.awt.*;

public class IntroPanel extends JPanel {
    public IntroPanel() {
        setBackground(Color.LIGHT_GRAY);
        JLabel l1 = new JLabel("Demonstration of Layout Managers");
        add(l1);
    }
}
