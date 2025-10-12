// Compile: javac -cp ".;lib/json-20240303.jar" q2.java
// Run:     java -cp ".;lib/json-20240303.jar" q2

import org.json.JSONArray;
import org.json.JSONObject;

public class q2 {
    public static void main(String[] args) {
        // Create a JSON array
        JSONArray students = new JSONArray();

        // Create student 1
        JSONObject s1 = new JSONObject();
        s1.put("name", "Alice");
        s1.put("rollNo", 101);
        s1.put("marks", 95);

        // Create student 2
        JSONObject s2 = new JSONObject();
        s2.put("name", "Bob");
        s2.put("rollNo", 102);
        s2.put("marks", 89);

        // Create student 3
        JSONObject s3 = new JSONObject();
        s3.put("name", "Charlie");
        s3.put("rollNo", 103);
        s3.put("marks", 92);

        // Add all students to array
        students.put(s1);
        students.put(s2);
        students.put(s3);

        // Display formatted JSON array
        System.out.println("Student JSON Array:");
        System.out.println(students.toString(4));  // pretty print with 4 spaces
    }
}
