/*
 * Problem: Find Greatest of Three Numbers
 *
 * Purpose:
 *   - Learn how to use built-in methods (`Math.max()`).
 *   - Practice taking user input and basic conditional logic.
 *
 * Example:
 *   Input:  a = 10, b = 25, c = 7
 *   Output: Greatest : 25
 */

package module_11_methods.more_on_function.Questions;

import java.util.Scanner;

public class J_01_Greatest_of_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --------------------------------------------------
        // Taking Input
        // --------------------------------------------------
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // --------------------------------------------------
        // Method 1: Using built-in Math.max()
        // --------------------------------------------------
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Greatest (using Math.max): " + max);

        // --------------------------------------------------
        // Method 2: Using custom user-defined method
        // --------------------------------------------------
        int customMax = findMax(a, b, c);
        System.out.println("Greatest (using custom method): " + customMax);
    }

    // User-defined method to find max of three numbers
    static int findMax(int x, int y, int z) {
        int max = x; // assume x is greatest
        if (y > max) max = y;
        if (z > max) max = z;
        return max;
    }
}

/*
 * Quick Notes for Revision:
 *  - Math.max(x, y) → returns greater of two numbers.
 *  - Nesting Math.max() → to find max of more than two.
 *      Example: Math.max(a, Math.max(b, c))
 *  - Custom method helps understand conditional comparisons.
 *  - Use Scanner for runtime input.
 */
