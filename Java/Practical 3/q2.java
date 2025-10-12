// Program to demonstrate try, catch, and finally blocks
public class q2 {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block...");
            
            int num = 10;
            int divisor = 0;
            
            // This line may throw an ArithmeticException
            int result = num / divisor;
            
            System.out.println("Result: " + result);  // Will not execute
        } 
        catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero is not allowed.");
        } 
        finally {
            System.out.println("Finally block executed — this always runs!");
        }

        System.out.println("Program continues normally after try-catch-finally...");
    }
}
