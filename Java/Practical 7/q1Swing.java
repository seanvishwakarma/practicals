// Compile: javac q1Swing.java
// Run:     java q1Swing

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class q1Swing extends JFrame {

    public q1Swing() {
        // Set the title of the window
        super("Basic Swing Window");

        // Set the size of the window
        setSize(400, 200);

        // Use null layout for absolute positioning
        setLayout(null);

        // Create a JLabel
        JLabel label = new JLabel("Hello, Swing!");
        label.setBounds(50, 30, 200, 30); // x, y, width, height
        add(label);

        // Create a JButton
        JButton button = new JButton("Click Me");
        button.setBounds(50, 80, 100, 30);
        add(button);

        // Close the application when the window is closed
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of q1Swing
        new q1Swing();
    }
}
