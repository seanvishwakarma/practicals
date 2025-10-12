// Program to demonstrate handling of predefined exceptions
public class q1 {
    public static void main(String[] args) {
        try {
            // Case 1: Divide by zero (ArithmeticException)
            int a = 10;
            int b = 0;
            int result = a / b;  // This will throw ArithmeticException
            System.out.println("Result: " + result);

            // Case 2: Access invalid array index (ArrayIndexOutOfBoundsException)
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Invalid index
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index accessed.");
        } 
        catch (Exception e) {
            // Optional generic catch for any other unexpected exception
            System.out.println("An unexpected error occurred: " + e);
        }

        System.out.println("Program continues after exception handling...");
    }
}
