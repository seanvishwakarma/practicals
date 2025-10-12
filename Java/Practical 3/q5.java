import java.util.Scanner;

// Step 1: Create a user-defined exception class
class InvalidMarksException extends Exception {
    // Constructor to pass custom message
    public InvalidMarksException(String message) {
        super(message);
    }
}

// Step 2: Main class to test the custom exception
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0 - 100): ");
        int marks = sc.nextInt();
        sc.close();

        try {
            // Step 3: Check condition and throw custom exception
            if (marks < 0 || marks > 100) {
                throw new InvalidMarksException("Invalid Marks! Marks should be between 0 and 100.");
            } else {
                System.out.println("Marks entered: " + marks);
            }
        } 
        catch (InvalidMarksException e) {
            // Step 4: Catch and handle custom exception
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program executed successfully.");
    }
}
