/*
 * Topic: Geometric Progression (GP) Series
 * Concept: Using loops and math formula in Java
 *
 * Problem:
 *  - Print the first 'n' terms of a Geometric Progression series.
 *
 * Formula Reminder:
 *   nth term of GP = a * r^(n-1)
 *   where:
 *     a = first term
 *     r = common ratio
 *
 * Example:
 * Input:
 *   n = 5
 *   a = 2
 *   r = 3
 * Output:
 *   GP Series (first 5 terms): 2 6 18 54 162
 */

package module_10_loops;

import java.util.Scanner;

public class J_06_GeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter n (number of terms): ");
        int n = sc.nextInt();

        System.out.print("Enter a (first term): ");
        int a = sc.nextInt();

        System.out.print("Enter r (common ratio): ");
        int r = sc.nextInt();

        // --------------------------------------------------
        // Method-1: Iterative calculation
        // Logic: keep multiplying by r in each step
        // --------------------------------------------------
        System.out.print("GP Series (method-1, iterative): ");
        int term = a; // first term
        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term *= r; // multiply by common ratio
        }
        System.out.println();

        // --------------------------------------------------
        // Method-2: Direct formula
        // Formula: nth term = a * r^(i-1)
        // --------------------------------------------------
        System.out.print("GP Series (method-2, formula):   ");
        for (int i = 1; i <= n; i++) {
            int current = (int) (a * Math.pow(r, i - 1));
            System.out.print(current + " ");
        }
        System.out.println();
    }
}
