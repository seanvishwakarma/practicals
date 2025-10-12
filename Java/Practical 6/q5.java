// Compile: javac -cp ".;lib/gson-2.11.0.jar" q5.java
// Run:     java -cp ".;lib/gson-2.11.0.jar" q5

import com.google.gson.Gson;

// Define a simple Student class
class Student {
    String name;
    int rollNo;
    double marks;

    // Constructor
    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
}

public class q5 {
    public static void main(String[] args) {
        // Create a Student object
        Student s1 = new Student("Alice", 101, 92.5);

        // Create a Gson object
        Gson gson = new Gson();

        // Convert Java object to JSON string
        String jsonString = gson.toJson(s1);
        System.out.println("Java Object → JSON String:");
        System.out.println(jsonString);

        // Convert JSON string back to Java object
        Student s2 = gson.fromJson(jsonString, Student.class);
        System.out.println("\nJSON String → Java Object:");
        System.out.println("Name: " + s2.name);
        System.out.println("Roll No: " + s2.rollNo);
        System.out.println("Marks: " + s2.marks);
    }
}
