// Define the interface
interface Drawable {
    void draw();  // abstract method
}

// Class Circle implementing Drawable
class Circle implements Drawable {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Implement the draw() method
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
        // Optional: display area as well
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle = " + area);
    }
}

// Main class
public class q10b {
    public static void main(String[] args) {
        // Create Circle object
        Drawable d = new Circle(5.0);

        // Call draw() method
        d.draw();
    }
}
