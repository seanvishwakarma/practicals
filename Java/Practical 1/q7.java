// Define the Rectangle class
class Rectangle {
    // Attributes (instance variables)
    double length;
    double breadth;

    // Parameterized constructor
    Rectangle(double length, double breadth) {
        // Use 'this' to refer to instance variables
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and display area
    void area() {
        double area = length * breadth;
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area of Rectangle: " + area);
    }
}

// Main class
public class q7 {
    public static void main(String[] args) {
        // Create Rectangle objects using constructor
        Rectangle r1 = new Rectangle(5.5, 3.0);
        Rectangle r2 = new Rectangle(10.0, 4.5);

        // Display area of rectangles
        System.out.println("Rectangle 1:");
        r1.area();

        System.out.println("\nRectangle 2:");
        r2.area();
    }
}
