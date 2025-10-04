/*
 * Problem: Find Permutation and Combination
 *
 * Purpose:
 *   - Practice using methods and factorials.
 *   - Learn how to calculate permutations (nPr) and combinations (nCr).
 *
 * Concepts:
 *   - Formula for Combination (nCr): n! / (r! * (n - r)!)
 *   - Formula for Permutation (nPr): n! / (n - r)!
 *
 * Example:
 *   Input: n = 5, r = 2
 *   Output:
 *       Combination (nCr): 10
 *       Permutation (nPr): 20
 */

package module_11_methods.more_on_function.Questions;

import java.util.Scanner;

public class J_02_Permutation_Combination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();

        // Calling functions
        System.out.println("Combination (nCr): " + combination(n, r));
        System.out.println("Permutation (nPr): " + permutation(n, r));
    }

    // --------------------------------------------------
    // Factorial method (reused in both nCr and nPr)
    // --------------------------------------------------
    public static int factorial(int n) {
        int fact = 1;
        if (n == 0) return fact; // 0! = 1
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // --------------------------------------------------
    // Method to find Combination (nCr)
    // --------------------------------------------------
    public static int combination(int n, int r) {
        int nFact = factorial(n);
        int rFact = factorial(r);
        int nrFact = factorial(n - r);
        return nFact / (rFact * nrFact);
    }

    // --------------------------------------------------
    // Method to find Permutation (nPr)
    // --------------------------------------------------
    public static int permutation(int n, int r) {
        int nFact = factorial(n);
        int nrFact = factorial(n - r);
        return nFact / nrFact;
    }
}

/*
 * Quick Notes for Revision:
 *  - nCr = n! / (r! × (n - r)!)
 *  - nPr = n! / (n - r)!
 *  - Factorial of 0 is always 1.
 *
 *  - Combination → order does NOT matter (selection)
 *  - Permutation → order DOES matter (arrangement)
 *
 * Example:
 *   n = 5, r = 2
 *   nCr = 10  → (AB, AC, AD, AE, BC, BD, BE, CD, CE, DE)
 *   nPr = 20  → (AB, AC, AD, AE, BA, BC, BD, BE, CA, CB, ...)
 *
 * Interview Tip:
 *  - For large values of n, factorial can overflow → use long or BigInteger.
 *  - In competitive programming, modular arithmetic is often used to avoid overflow.
 */
