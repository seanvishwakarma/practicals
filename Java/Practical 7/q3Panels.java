// Compile: javac q3Panels.java
// Run:     java q3Panels

import javax.swing.*;
import java.awt.*;

public class q3Panels extends JFrame {

    public q3Panels() {
        // Set main frame properties
        super("JPanel and Layout Managers Demo");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); // Main frame uses BorderLayout

        // -------------------
        // Panel 1: Labels and TextFields (user input)
        // Using GridLayout (rows=2, cols=2)
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 2, 10, 10)); // rows, cols, hgap, vgap

        // Add labels and text fields
        inputPanel.add(new JLabel("First Name:"));
        inputPanel.add(new JTextField());
        inputPanel.add(new JLabel("Last Name:"));
        inputPanel.add(new JTextField());

        // Add some padding around the panel
        inputPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // -------------------
        // Panel 2: Buttons
        // Using FlowLayout
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton submitButton = new JButton("Submit");
        JButton cancelButton = new JButton("Cancel");

        buttonPanel.add(submitButton);
        buttonPanel.add(cancelButton);

        // -------------------
        // Add panels to main frame
        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new q3Panels();
    }
}
