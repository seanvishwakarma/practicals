import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // 1. Create a HashMap to store roll numbers and student names
        HashMap<Integer, String> students = new HashMap<>();

        // 2. Add elements using put()
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "David");

        System.out.println("HashMap after adding elements: " + students);

        // 3. Retrieve element using get()
        System.out.println("Student with roll number 102: " + students.get(102));

        // 4. Remove element using remove()
        students.remove(103); // remove Charlie
        System.out.println("HashMap after removing roll number 103: " + students);

        // 5. Iterate using entrySet()
        System.out.println("Iterating through HashMap entries:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
