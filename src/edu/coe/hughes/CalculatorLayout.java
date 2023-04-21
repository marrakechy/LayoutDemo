package edu.coe.hughes;
import java.awt.*;
import javax.swing.*;

public class CalculatorLayout extends JFrame {

    public CalculatorLayout() {
        super("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the calculator panel
        JPanel calculatorPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Add the calculator display
        JTextField display = new JTextField(20);
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        gbc.gridwidth = 4;
        calculatorPanel.add(display, gbc);

        // Add the calculator buttons
        gbc.gridwidth = 1;
        gbc.gridy++;
        addButton(calculatorPanel, gbc, "7");
        addButton(calculatorPanel, gbc, "8");
        addButton(calculatorPanel, gbc, "9");
        addButton(calculatorPanel, gbc, "/");

        gbc.gridy++;
        addButton(calculatorPanel, gbc, "4");
        addButton(calculatorPanel, gbc, "5");
        addButton(calculatorPanel, gbc, "6");
        addButton(calculatorPanel, gbc, "*");

        gbc.gridy++;
        addButton(calculatorPanel, gbc, "1");
        addButton(calculatorPanel, gbc, "2");
        addButton(calculatorPanel, gbc, "3");
        addButton(calculatorPanel, gbc, "-");

        gbc.gridy++;
        addButton(calculatorPanel, gbc, "0");
        addButton(calculatorPanel, gbc, ".");
        addButton(calculatorPanel, gbc, "C");
        addButton(calculatorPanel, gbc, "+");

        gbc.gridy++;
        gbc.gridwidth = 4;
        addButton(calculatorPanel, gbc, "=");

        // Add the calculator panel to the frame
        getContentPane().add(calculatorPanel);
        pack();
        setLocationRelativeTo(null);
    }

    private void addButton(JPanel panel, GridBagConstraints gbc, String label) {
        JButton button = new JButton(label);
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        gbc.gridx++;
        panel.add(button, gbc);
    }

}

