import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.close();

        try {
            // Check condition and explicitly throw an exception
            if (age < 18) {
                throw new ArithmeticException("Not eligible to vote");
            } else {
                System.out.println("Eligible to vote!");
            }
        } 
        catch (ArithmeticException e) {
            // Handle the explicitly thrown exception
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Program ended normally.");
    }
}
