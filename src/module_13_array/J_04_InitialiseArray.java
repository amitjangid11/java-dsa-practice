/*
 * Problem: Array Initialization in Java
 *
 * Purpose:
 *   - Learn how to initialize arrays in a single step (without separate assignments).
 *   - Practice different output methods.
 *
 * Concept:
 *   - Arrays can be initialized directly with values:
 *       int[] arr = {10, 20, 30, 40};
 *   - arr.length gives the size of the array.
 *
 * Example Output:
 *   Using for loop: 10 20 30 40 50 60 70 80 90 100
 *   Using for-each: 10 20 30 40 50 60 70 80 90 100
 *   Using Arrays.toString: [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
 */

package module_13_array;

import java.util.Arrays;

public class J_04_InitialiseArray {
    public static void main(String[] args) {
        // --------------------------------------------------
        // Step 1: Initialization in a single step
        // --------------------------------------------------
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // --------------------------------------------------
        // Method 1: Using for loop (index-based)
        // --------------------------------------------------
        System.out.print("Using for loop: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // --------------------------------------------------
        // Method 2: Using for-each loop
        // --------------------------------------------------
        System.out.print("Using for-each: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        // --------------------------------------------------
        // Method 3: Using Arrays.toString() (shortcut)
        // --------------------------------------------------
        System.out.println("Using Arrays.toString: " + Arrays.toString(arr));
    }
}

/*
 * Quick Notes for Revision:
 *  - Direct initialization → int[] arr = {1, 2, 3};
 *  - arr.length gives total number of elements.
 *  - Printing options:
 *      for loop → index-based control.
 *      for-each → clean & simple.
 *      Arrays.toString(arr) → whole array in one go.
 */
