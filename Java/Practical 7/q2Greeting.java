// Compile: javac q2Greeting.java
// Run:     java q2Greeting

import javax.swing.*;
import java.awt.event.*;

public class q2Greeting extends JFrame {

    private JTextField nameField;
    private JLabel greetingLabel;
    private JButton greetButton;

    public q2Greeting() {
        // Set window title
        super("Greeting Application");

        // Set size and layout
        setSize(400, 200);
        setLayout(null);

        // JLabel for prompt
        JLabel promptLabel = new JLabel("Enter your name:");
        promptLabel.setBounds(30, 30, 120, 25);
        add(promptLabel);

        // JTextField for user input
        nameField = new JTextField();
        nameField.setBounds(160, 30, 150, 25);
        add(nameField);

        // JButton for greeting
        greetButton = new JButton("Greet");
        greetButton.setBounds(120, 70, 100, 30);
        add(greetButton);

        // JLabel for displaying greeting
        greetingLabel = new JLabel();
        greetingLabel.setBounds(30, 120, 300, 25);
        add(greetingLabel);

        // Add action listener for the button
        greetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                if (!name.isEmpty()) {
                    greetingLabel.setText("Hello, " + name + "!");
                } else {
                    greetingLabel.setText("Please enter your name.");
                }
            }
        });

        // Close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make visible
        setVisible(true);
    }

    public static void main(String[] args) {
        new q2Greeting();
    }
}
