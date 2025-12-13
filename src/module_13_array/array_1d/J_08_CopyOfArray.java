/*
 * Problem: Copying Arrays (Shallow Copy vs Deep Copy)
 *
 * Purpose:
 *   - Understand the difference between shallow and deep copy in Java arrays.
 *
 * Concept:
 *   - Shallow Copy:
 *       int[] a = arr;
 *       → Both variables point to the same array in memory.
 *       → Change in one reflects in the other.
 *
 *   - Deep Copy:
 *       int[] b = Arrays.copyOf(arr, arr.length);
 *       → Creates a new independent copy in memory.
 *       → Change in one does not affect the other.
 *
 * Example Output:
 *   Shallow Copy Test:
 *     arr[0] after modifying a[0] = 10
 *
 *   Deep Copy Test:
 *     arr[0] after modifying brr[0] = 1
 */

package module_13_array.array_1d;

import java.util.Arrays;

public class J_08_CopyOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // --------------------------------------------------
        // Shallow Copy Example
        // --------------------------------------------------
        int[] a = arr; // Shallow copy → points to same array
        a[0] = 10; // modifying a[0] also changes arr[0]
        System.out.println("After shallow copy modification: arr[0] = " + arr[0]); // 10

        // Reset array for deep copy demo
        arr[0] = 1;

        // --------------------------------------------------
        // Deep Copy Example
        // --------------------------------------------------
        int[] brr = Arrays.copyOf(arr, arr.length); // Deep copy
        brr[0] = 10; // modifying brr[0] does not affect arr[0]
        System.out.println("After deep copy modification: arr[0] = " + arr[0]); // 1

        // Print both arrays
        System.out.println("Original Array (arr): " + Arrays.toString(arr));
        System.out.println("Deep Copy (brr): " + Arrays.toString(brr));
    }
}

/*
 * Quick Notes for Revision:
 *  - Shallow Copy → arr and new array point to SAME memory.
 *      int[] a = arr;
 *      Change in a → reflects in arr.
 *
 *  - Deep Copy → creates NEW independent array.
 *      int[] b = Arrays.copyOf(arr, arr.length);
 *      Change in b → does not affect arr.
 *
 *  - For multi-dimensional arrays (2D), Arrays.copyOf() is still shallow (nested arrays not cloned).
 */
