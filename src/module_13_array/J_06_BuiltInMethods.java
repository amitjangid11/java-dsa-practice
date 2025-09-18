/*
 * Problem: Using Built-in Methods of java.util.Arrays
 *
 * Purpose:
 *   - Learn how to use library methods to work with arrays.
 *   - Practice sorting and efficient printing.
 *
 * Concept:
 *   - Arrays.sort(arr) → sorts array in ascending order.
 *   - Arrays.toString(arr) → prints array in readable format.
 *
 * Example Output:
 *   Original Array: 30 10 40 23 89 34
 *   Sorted Array:   10 23 30 34 40 89
 */

package module_13_array;

import java.util.Arrays;

public class J_06_BuiltInMethods {
    public static void main(String[] args) {
        int[] arr = {30, 10, 40, 23, 89, 34};

        // --------------------------------------------------
        // Printing original array
        // --------------------------------------------------
        System.out.print("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // --------------------------------------------------
        // Using built-in sort method
        // --------------------------------------------------
        Arrays.sort(arr); // sorts array in ascending order

        // Method 1: Using loop
        System.out.print("Sorted Array (using loop): ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Method 2: Using Arrays.toString() (shortcut)
        System.out.println("Sorted Array (using Arrays.toString): " + Arrays.toString(arr));

        // --------------------------------------------------
        // Other useful Arrays methods (Uncomment to explore)
        // --------------------------------------------------
        /*
        // Fill array with a specific value
        Arrays.fill(arr, 5);
        System.out.println("After fill: " + Arrays.toString(arr));

        // Binary search (array must be sorted)
        int index = Arrays.binarySearch(arr, 34);
        System.out.println("Index of 34: " + index);

        // Compare arrays
        int[] arr2 = {10, 23, 30, 34, 40, 89};
        System.out.println("Arrays equal? " + Arrays.equals(arr, arr2));
        */
    }
}

/*
 * Quick Notes for Revision:
 *  - Arrays.sort(arr) → sorts ascending (uses Dual-Pivot Quicksort).
 *  - Arrays.toString(arr) → quick way to print full array.
 *  - Arrays.fill(arr, value) → fills entire array with given value.
 *  - Arrays.binarySearch(arr, key) → returns index (works on sorted array).
 *  - Arrays.equals(arr1, arr2) → compares two arrays for equality.
 */
