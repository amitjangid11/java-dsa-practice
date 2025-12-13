/*
 * Problem: Efficient Output of Array Elements
 *
 * Purpose:
 *   - Learn how to print array elements without repeating code.
 *   - Understand both index-based and enhanced for-each loops.
 *
 * Concept:
 *   - Instead of printing manually (arr[0], arr[1], ...), use loops.
 *   - for loop → gives index access (useful when index matters).
 *   - enhanced for-each loop → clean way when you only need values.
 *
 * Example Output:
 *   Using for loop:
 *   10 20 30 40 50
 *
 *   Using for-each loop:
 *   10 20 30 40 50
 */

package module_13_array.array_1d;

public class J_02_EfficientOutput {
    public static void main(String[] args) {
        int[] arr = new int[5];

        // Initialization of individual elements
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // --------------------------------------------------
        // Method 1: Using for loop (index-based)
        // --------------------------------------------------
        System.out.println("Using for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // --------------------------------------------------
        // Method 2: Using for-each loop (optimized)
        // --------------------------------------------------
        System.out.println("Using for-each loop:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

/*
 * Quick Notes for Revision:
 *  - Use arr.length to avoid hardcoding size.
 *  - for loop → gives access to index (useful for updating, conditions).
 *  - for-each loop → shorter, cleaner, when index is not required.
 */
