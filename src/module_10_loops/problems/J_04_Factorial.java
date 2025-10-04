/*
 * Problem: Find the Factorial of a Number
 *
 * Purpose:
 *   - Practice using loops and method calls.
 *   - Understand how to calculate factorial iteratively (and recursively).
 *
 * Definition:
 *   - Factorial of n (written as n!) = n × (n-1) × (n-2) × ... × 1
 *   - Example:
 *       5! = 5 × 4 × 3 × 2 × 1 = 120
 *
 * Example Input/Output:
 *   Input: 5
 *   Output: Factorial : 120
 */

package module_10_loops.problems;

import java.util.Scanner;

public class J_04_Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // --------------------------------------------------
        // Method 1: Iterative approach (using loop)
        // --------------------------------------------------
        int fact = factorial(n);
        System.out.println("Factorial (iterative): " + fact);

        // --------------------------------------------------
        // Method 2: Recursive approach (optional)
        // --------------------------------------------------
        int factRec = factorialRecursive(n);
        System.out.println("Factorial (recursive): " + factRec);
    }

    // Iterative method using for loop
    public static int factorial(int n) {
        int fact = 1;
        if (n == 0) return fact; // 0! = 1
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Recursive method for factorial
    public static int factorialRecursive(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorialRecursive(n - 1);
    }
}

/*
 * Quick Notes for Revision:
 *  - Factorial grows very fast (even small n gives large numbers).
 *  - 0! and 1! are both defined as 1.
 *  - Iterative: uses loop (efficient and avoids stack overflow).
 *  - Recursive: shorter code but may cause stack overflow for large n.
 *
 * Interview Tip:
 *  - Know both iterative and recursive solutions.
 *  - Recursive definition: n! = n × (n−1)!
 */
