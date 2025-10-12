// javac -cp ".;lib/gson-2.11.0.jar" GsonDemo.java
// java -cp ".;lib/gson-2.11.0.jar" GsonDemo

import org.json.JSONObject;

public class q1 {
    public static void main(String[] args) {
        // 1. Create a JSON object
        JSONObject student = new JSONObject();

        // 2. Put key-value pairs
        student.put("name", "Alice");
        student.put("rollNo", 101);
        student.put("course", "Computer Science");
        student.put("marks", 95);

        // 3. Display JSON string
        System.out.println("Student JSON Object:");
        System.out.println(student.toString(4)); // pretty print with 4-space indentation
    }
}
