import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 1. Create an ArrayList to store student names
        ArrayList<String> students = new ArrayList<>();

        // 2. Add elements
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        System.out.println("After adding elements: " + students);

        // 3. Insert element at specific index
        students.add(1, "David");  // Insert "David" at index 1
        System.out.println("After inserting at index 1: " + students);

        // 4. Remove element
        students.remove("Bob");     // Remove by value
        // students.remove(2);       // Remove by index (optional)
        System.out.println("After removing Bob: " + students);

        // 5. Iterate using for-each loop
        System.out.println("Iterating through ArrayList:");
        for (String name : students) {
            System.out.println(name);
        }
    }
}
