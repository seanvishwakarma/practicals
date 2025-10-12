// Compile: javac q4Calculator.java
// Run:     java q4Calculator

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class q4Calculator extends JFrame implements ActionListener {

    private JTextField num1Field, num2Field;
    private JButton addButton;
    private JLabel resultLabel;

    public q4Calculator() {
        // Set frame properties
        super("Simple Calculator - Add Two Numbers");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10)); // rows, cols, hgap, vgap

        // Create components
        JLabel num1Label = new JLabel("Number 1:");
        num1Field = new JTextField();

        JLabel num2Label = new JLabel("Number 2:");
        num2Field = new JTextField();

        addButton = new JButton("Add");
        resultLabel = new JLabel("Result: ");

        // Add ActionListener to the button
        addButton.addActionListener(this);

        // Add components to frame
        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(addButton);
        add(resultLabel);

        // Make frame visible
        setVisible(true);
    }

    // Implement actionPerformed method (Delegation Event Model)
    public void actionPerformed(ActionEvent e) {
        try {
            // Get input values
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());

            // Calculate sum
            double sum = num1 + num2;

            // Display result
            resultLabel.setText("Result: " + sum);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        new q4Calculator();
    }
}
