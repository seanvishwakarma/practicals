// Class demonstrating method overloading
class Calculator {

    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers (overloaded method)
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles (overloaded method)
    double add(double a, double b) {
        return a + b;
    }
}

// Main class
public class q9a {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Call different versions of add()
        int sum1 = calc.add(5, 10);              // calls add(int, int)
        int sum2 = calc.add(5, 10, 15);          // calls add(int, int, int)
        double sum3 = calc.add(5.5, 10.5);       // calls add(double, double)

        // Display results
        System.out.println("Sum of 2 integers: " + sum1);
        System.out.println("Sum of 3 integers: " + sum2);
        System.out.println("Sum of 2 doubles: " + sum3);
    }
}
