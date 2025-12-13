/*
 * Problem: Passing Arrays to Methods
 *
 * Purpose:
 *   - Understand how arrays are passed to methods in Java.
 *   - Learn that arrays are passed by reference (not by value).
 *
 * Concept:
 *   - In Java, primitive types (int, char, etc.) are passed by value.
 *   - Arrays and objects are passed by reference → method receives the same memory address.
 *   - So, changes made inside the method affect the original array.
 *
 * Example Output:
 *   Before change: 1
 *   After change: 10
 */

package module_13_array.array_1d;

public class J_05_PassingArrayToMethods {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        // Before change
        System.out.println("Before change: " + arr[0]); // 1

        // Call method that modifies array
        change(arr); // Pass by reference

        // After change
        System.out.println("After change: " + arr[0]); // 10
    }

    // --------------------------------------------------
    // Method 1: Modify first element
    // --------------------------------------------------
    public static void change(int[] brr) {
        brr[0] = 10; // arr and brr point to the same array in memory
    }

    // --------------------------------------------------
    // Method 2: Multiply all elements by 2 (Uncomment to use)
    // --------------------------------------------------
    /*
    public static void modifyAll(int[] brr) {
        for (int i = 0; i < brr.length; i++) {
            brr[i] *= 2; // multiply each element by 2
        }
    }
    */
}

/*
 * Quick Notes for Revision:
 *  - Primitive types → passed by value (copy created).
 *  - Arrays/objects → passed by reference (same memory).
 *  - Method can change array elements directly.
 *  - Example: change(arr) updates arr[0] from 1 → 10.
 */
