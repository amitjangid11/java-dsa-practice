/*
 * Problem: Find Minimum Element in Array
 *
 * Purpose:
 *   - Learn how to find the smallest element in an array.
 *   - Practice using loops and Math.min().
 *
 * Example:
 *   Input:  {-10, -2, -30, -42, -25, -34, -234, -42}
 *   Output: Minimum Element in array is : -234
 */

package module_13_array.questions;

public class J_06_MinimumElement {
    public static void main(String[] args) {
        int[] arr = {-10, -2, -30, -42, -25, -34, -234, -42};
        int n = arr.length;

        // --------------------------------------------------
        // Method 1: Manual loop
        // --------------------------------------------------
        int min = Integer.MAX_VALUE; // start with largest possible value
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum Element in array is : " + min);

        // --------------------------------------------------
        // Method 2: Using Math.min()
        // --------------------------------------------------
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min2 = Math.min(min2, arr[i]);
        }
        System.out.println("Minimum Element using Math.min() is : " + min2);
    }
}

/*
 * Quick Notes for Revision:
 *  - Initialize min with Integer.MAX_VALUE (a very large number).
 *  - Compare each element with min → update if smaller.
 *  - Shortcut: use Math.min(min, arr[i]).
 *  - For max element → initialize with Integer.MIN_VALUE.
 */
