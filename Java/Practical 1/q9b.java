// Parent class
class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    // Overriding the parent method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class
class Cat extends Animal {
    // Overriding the parent method
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class q9b {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();

        System.out.println("Animal:");
        a.sound();  // Calls parent class method

        System.out.println("\nDog:");
        d.sound();  // Calls overridden method in Dog

        System.out.println("\nCat:");
        c.sound();  // Calls overridden method in Cat
    }
}
