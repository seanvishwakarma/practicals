import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class CollectionDemo {
    public static void main(String[] args) {
        // 1. ArrayList of student names (can have duplicates)
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Alice");
        studentList.add("Bob");
        studentList.add("Charlie");
        studentList.add("Alice");   // duplicate
        studentList.add("David");
        studentList.add("Bob");     // duplicate

        System.out.println("ArrayList (with duplicates): " + studentList);

        // 2. HashSet to store unique student names
        HashSet<String> uniqueStudents = new HashSet<>(studentList);
        System.out.println("HashSet (unique names): " + uniqueStudents);

        // 3. HashMap to assign roll numbers
        HashMap<Integer, String> studentMap = new HashMap<>();
        int rollNo = 101;
        for (String name : uniqueStudents) {
            studentMap.put(rollNo++, name);
        }

        // 4. Display HashMap entries
        System.out.println("\nHashMap (Roll No → Student Name):");
        for (HashMap.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
