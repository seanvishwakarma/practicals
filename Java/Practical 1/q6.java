// Define the Student class
class Student {
    // Data members (fields)
    String name;
    int rollNo;
    double marks;

    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("-----------------------");
    }
}

// Main class
public class q6 {
    public static void main(String[] args) {
        // Create first student object
        Student s1 = new Student();
        s1.name = "Aditya Vishwakarma";
        s1.rollNo = 24072;
        s1.marks = 89.5;

        // Create second student object
        Student s2 = new Student();
        s2.name = "Nistha Jain";
        s2.rollNo = 24073;
        s2.marks = 92.0;

        // Display both students' details
        System.out.println("Student Details:\n");
        s1.displayDetails();
        s2.displayDetails();
    }
}
