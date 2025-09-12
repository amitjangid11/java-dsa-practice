/*
 * Problem: Check if a number is Prime
 *
 * Purpose:
 *   - Learn how to use `break` (exit loop early when factor is found)
 *   - Learn why `boolean` is useful for flags (true/false conditions)
 *
 * Definitions:
 *   - Prime Number: A number greater than 1 with no divisors other than 1 and itself.
 *       Example: 2, 3, 5, 7 → Prime
 *                4, 6, 8, 9 → Not Prime
 *
 * Example Input/Output:
 *   Input: 7
 *   Output: Prime Number
 *
 *   Input: 9
 *   Output: Not Prime
 */

package module_10_loops.problems;

import java.util.Scanner;

public class J_02_Chk_PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        // Edge case: numbers <= 1 are not prime
        if (n <= 1) {
            System.out.println("Not Prime");
            return;
        }

        // --------------------------------------------------
        // Method 1: Brute Force Check (using break + boolean)
        // --------------------------------------------------
        boolean isPrime = true;  // assume prime unless proven otherwise
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {  // found a factor
                isPrime = false;
                break; // no need to check further
            }
        }

        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime");
        }

        // --------------------------------------------------
        // Method 2: Optimized (Check up to √n)
        // Uncomment below code to use it
        // --------------------------------------------------
        /*
        boolean isPrimeOptimized = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrimeOptimized = false;
                break;
            }
        }

        if (isPrimeOptimized) {
            System.out.println("Prime Number (Optimized Check)");
        } else {
            System.out.println("Not Prime (Optimized Check)");
        }
        */
    }
}
