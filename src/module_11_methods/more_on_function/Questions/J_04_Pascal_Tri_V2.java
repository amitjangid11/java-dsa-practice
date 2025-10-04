/*
 * Problem: Generate Pascal's Triangle (Version 2)
 *
 * Purpose:
 *   - Learn how to dynamically print Pascal's Triangle using nCr (Combination Formula).
 *   - Practice BigInteger for large factorials.
 *   - Take user input for number of rows.
 *
 * Formula: nCr = n! / (r! * (n - r)!)
 *
 * Example (rows = 5):
 *         1
 *        1 1
 *       1 2 1
 *      1 3 3 1
 *     1 4 6 4 1
 */

package module_11_methods.more_on_function.Questions;

import java.math.BigInteger;
import java.util.Scanner;

public class J_04_Pascal_Tri_V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows for Pascal's Triangle: ");
        int rows = sc.nextInt();

        printPascalTriangle(rows);
    }

    // --------------------------------------------------
    // Method to print Pascal’s Triangle
    // --------------------------------------------------
    public static void printPascalTriangle(int rows) {
        for (int n = 0; n < rows; n++) {

            // Print leading spaces to shape the triangle
            for (int s = rows - n; s > 1; s--) {
                System.out.print(" ");
            }

            // Print combination values (nCr)
            for (int r = 0; r <= n; r++) {
                System.out.print(combination(n, r) + " ");
            }

            System.out.println(); // next row
        }
    }

    // --------------------------------------------------
    // Combination formula: nCr = n! / (r! * (n - r)!)
    // Using BigInteger for large factorial values
    // --------------------------------------------------
    public static BigInteger combination(int n, int r) {
        return factorial(n).divide(factorial(r).multiply(factorial(n - r)));
    }

    // --------------------------------------------------
    // Factorial using BigInteger
    // --------------------------------------------------
    public static BigInteger factorial(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}

/*
 * 🧠 Quick Notes for Revision:
 *  - Each element in Pascal's Triangle = nCr (combination formula)
 *  - nCr = n! / (r! × (n - r)!)
 *  - Each row starts and ends with 1
 *  - BigInteger is used because factorial values grow extremely fast (e.g., 30! ≈ 2.6e32)
 *
 * 🧩 Real Use Cases:
 *   - Binomial Expansion (e.g., (a + b)^n coefficients)
 *   - Probability and combinatorial math
 *   - Used in recursion & dynamic programming concepts later (like nCr table building)
 */
