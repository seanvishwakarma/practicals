// Compile: javac -cp ".;lib/json-20240303.jar" q4.java
// Run:     java -cp ".;lib/json-20240303.jar" q4

import org.json.JSONObject;

public class q4 {
    public static void main(String[] args) {
        // Create inner JSON object for address
        JSONObject address = new JSONObject();
        address.put("street", "123 Main Street");
        address.put("city", "Pune");
        address.put("state", "Maharashtra");
        address.put("zip", "411001");

        // Create outer JSON object for employee
        JSONObject employee = new JSONObject();
        employee.put("name", "Rahul Sharma");
        employee.put("id", 101);
        employee.put("department", "IT");
        employee.put("address", address); // nested object

        // Display formatted JSON
        System.out.println("Employee JSON Object:");
        System.out.println(employee.toString(4)); // pretty print
    }
}
