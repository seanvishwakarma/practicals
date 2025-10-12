import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5]; // array of 5 integers

        // Input 5 integers
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Initialize largest and smallest with the first element
        int largest = arr[0];
        int smallest = arr[0];

        // Loop through the array to find largest and smallest
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
            if (arr[i] < smallest)
                smallest = arr[i];
        }

        // Display the results
        System.out.println("\nArray elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nLargest element: " + largest);
        System.out.println("Smallest element: " + smallest);

        sc.close();
    }
}
