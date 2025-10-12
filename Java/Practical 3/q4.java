import java.io.*;  // For IOException

public class q4 {

    // Method that declares it may throw an IOException
    static void checkFile() throws IOException {
        // Simulate an exception (e.g., file not found)
        throw new IOException("File not found!");
    }

    public static void main(String[] args) {
        try {
            // Calling the method that throws an exception
            checkFile();
        } 
        catch (IOException e) {
            // Handle the propagated exception
            System.out.println("Exception handled in main(): " + e.getMessage());
        }

        System.out.println("Program continues after exception handling...");
    }
}
