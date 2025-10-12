// Program: Using Predefined Package (java.util)
// To read, sort, and print an integer array

import java.util.*;  // Importing predefined package

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // For taking user input

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];  // Declare array

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array using predefined method
        Arrays.sort(arr);

        System.out.println("Sorted array elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
