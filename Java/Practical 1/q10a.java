// Abstract class
abstract class Shape {
    // Abstract method (no body)
    abstract void area();
}

// Subclass Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Implement abstract method
    @Override
    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle with radius " + radius + " = " + area);
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Implement abstract method
    @Override
    void area() {
        double area = length * breadth;
        System.out.println("Area of Rectangle with length " + length + " and breadth " + breadth + " = " + area);
    }
}

// Main class
public class q10a {
    public static void main(String[] args) {
        // Create objects of Circle and Rectangle
        Shape s1 = new Circle(5.0);
        Shape s2 = new Rectangle(4.0, 6.0);

        // Call area() method
        s1.area();
        s2.area();
    }
}
