/*
 * Problem: Returning Array from Method
 *
 * Purpose:
 *   - Learn how to return arrays from methods in Java.
 *   - Demonstrates that arrays are objects and can be returned like other values.
 *
 * Concept:
 *   - Method can return:
 *       • A reference to an array.
 *       • Even an anonymous array (created on the fly).
 *
 * Example:
 *   static int[] get() {
 *       return new int[]{10, 20, 30};
 *   }
 *
 * Example Output:
 *   10
 *   30
 *   50
 *   90
 *   60
 */

package module_13_array.array_1d;

public class J_11_ReturningArrayFromMethod {

    // Method returning an array (anonymous array)
    static int[] get() {
        return new int[]{10, 30, 50, 90, 60};
    }

    // Another example: returning squares of numbers
    static int[] getSquares(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = (i + 1) * (i + 1); // squares
        }
        return res;
    }

    public static void main(String args[]) {
        // Calling method which returns an array
        int arr[] = get();
        System.out.println("Array returned from get():");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Example 2: Returning squares array
        int[] squares = getSquares(5);
        System.out.println("\nArray returned from getSquares():");
        for (int i : squares) {
            System.out.print(i + " ");
        }
    }
}

/*
 * Quick Notes for Revision:
 *  - Arrays can be returned from methods like normal values.
 *  - Common cases:
 *      • Returning anonymous arrays.
 *      • Returning computed arrays (results of some logic).
 *  - Advantage: Useful in utility/helper methods (e.g., generate Fibonacci, primes).
 */
