/*
 * Problem: For-Each Loop in Java
 *
 * Purpose:
 *   - Learn how to use the enhanced for loop to traverse arrays.
 *
 * Concept:
 *   - Normal for loop: gives you index + value.
 *   - For-each loop: gives only values (not indexes).
 *   - Syntax:
 *       for (datatype var : array) {
 *           // use var (element)
 *       }
 *
 *   Example:
 *       int[] arr = {10, 20, 30};
 *       for (int x : arr) {
 *           System.out.println(x);
 *       }
 *
 *   Limitation:
 *     - Cannot directly modify array elements (read-only access).
 *     - Use normal for loop when you need index or want to update values.
 *
 * Example Output:
 *   Original array: [12, 34, 5, 5, 6, 7]
 *   Sorted array:   [5, 5, 6, 7, 12, 34]
 *   Printing with for-each: 5 5 6 7 12 34
 */

package module_13_array.array_1d;

import java.util.Arrays;

public class J_07_ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {12, 34, 5, 5, 6, 7};

        // Print original array
        System.out.println("Original Array: " + Arrays.toString(arr));

        // Sort array before printing
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // --------------------------------------------------
        // For-each loop → simple way to print elements
        // --------------------------------------------------
        System.out.print("Using for-each loop: ");
        for (int value : arr) { // value takes each element of arr
            System.out.print(value + " ");
        }
        System.out.println();

        // --------------------------------------------------
        // Normal for loop for comparison
        // --------------------------------------------------
        System.out.print("Using normal for loop: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

/*
 * Quick Notes for Revision:
 *  - For-each → short, clean, only values (no index).
 *  - Normal for loop → use when you need index or want to update values.
 *  - For-each is best for printing, searching, and reading data.
 */
