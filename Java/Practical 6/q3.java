// Compile: javac -cp ".;lib/json-20240303.jar" q3.java
// Run:     java -cp ".;lib/json-20240303.jar" q3

import org.json.JSONObject;

public class q3 {
    public static void main(String[] args) {
        // Create a JSON string representing a book
        String bookData = "{ \"title\": \"Java Programming\", \"author\": \"John Doe\", \"price\": 499.99 }";

        // Parse JSON string into JSONObject
        JSONObject book = new JSONObject(bookData);

        // Extract individual values
        String title = book.getString("title");
        String author = book.getString("author");
        double price = book.getDouble("price");

        // Display the extracted values
        System.out.println("Book Details:");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : ₹" + price);
    }
}
