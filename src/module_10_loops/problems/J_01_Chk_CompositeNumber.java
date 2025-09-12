/*
 * Problem: Check if a number is Composite
 *
 * Definitions:
 *   - Factor: A number that divides another number completely (remainder = 0).
 *       Example: Factors of 12 are 1, 2, 3, 4, 6, 12
 *
 *   - Composite Number: A number that has factors other than 1 and itself.
 *       Example: 4 (factors: 1, 2, 4) → Composite
 *                5 (factors: 1, 5)   → NOT Composite (Prime)
 *                1 → Neither Prime nor Composite
 *
 * Example Input/Output:
 *   Input: 9
 *   Output: Composite Number (because 3 divides 9)
 *
 *   Input: 7
 *   Output: Not Composite (Prime Number)
 */

package module_10_loops.problems;

import java.util.Scanner;

public class J_01_Chk_CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Edge cases
        if (n <= 1) {
            System.out.println("Neither Prime nor Composite");
            return;
        }

        // --------------------------------------------------
        // Method 1: Brute Force Check
        // Check divisibility from 2 to n-1
        // --------------------------------------------------
        boolean isComposite = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {  // found a factor
                isComposite = true;
                break; // stop after finding the first factor
            }
        }

        if (isComposite) {
            System.out.println("Composite Number");
        } else {
            System.out.println("Not Composite (Prime Number)");
        }

        // --------------------------------------------------
        // Method 2: Optimized (Check up to √n)
        // Uncomment below code to use it
        // --------------------------------------------------
        /*
        boolean isCompositeOptimized = false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isCompositeOptimized = true;
                break;
            }
        }

        if (isCompositeOptimized) {
            System.out.println("Composite Number (Optimized Check)");
        } else {
            System.out.println("Not Composite (Prime Number)");
        }
        */
    }
}
