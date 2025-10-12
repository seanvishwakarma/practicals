// Base class
class Vehicle {
    String brand;
    int speed;

    // Constructor of Vehicle
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Method to display Vehicle details
    void showVehicle() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Derived class
class Car extends Vehicle {
    String model;

    // Constructor of Car
    Car(String brand, int speed, String model) {
        super(brand, speed); // Call parent class constructor
        this.model = model;
    }

    // Method to display Car details
    void display() {
        super.showVehicle(); // Call parent class method
        System.out.println("Model: " + model);
    }
}

// Main class
public class q8 {
    public static void main(String[] args) {
        // Create Car object
        Car car1 = new Car("Toyota", 120, "Corolla");
        Car car2 = new Car("Honda", 150, "Civic");

        // Display details
        System.out.println("Car 1 Details:");
        car1.display();

        System.out.println("\nCar 2 Details:");
        car2.display();
    }
}
