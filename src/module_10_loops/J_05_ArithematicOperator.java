/*
 * Topic: Arithmetic Progression (AP) Series
 * Concept: Using loops and arithmetic operators in Java
 *
 * Problem:
 *  - Print the first 'n' terms of an AP series.
 *  - Show different methods to generate the terms.
 *
 * Formula Reminder:
 *   nth term of AP = a + (n-1)*d
 *   where:
 *     a = first term
 *     d = common difference
 *
 * Example:
 * Input: n = 5
 * Output:
 *   Method-1 (odd numbers):         1 3 5 7 9
 *   Method-2 (odd numbers, formula): 1 3 5 7 9
 *   Method-2 (a=4, d=3):            4 7 10 13 16
 */

package module_10_loops;

import java.util.Scanner;

public class J_05_ArithematicOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (number of terms): ");
        int n = sc.nextInt();

        // --------------------------------------------------
        // Method-1: Using an extra variable
        // Example: Odd numbers -> 1, 3, 5, 7, ...
        // Logic: Start from a=1, keep adding 2
        // --------------------------------------------------
        int a = 1; // first term
        System.out.print("Method-1 (odd numbers): ");
        for (int i = 1; i <= n; i++) {  // loop runs n times
            System.out.print(a + " ");
            a += 2; // move to next odd number
        }
        System.out.println(); // line break

        // --------------------------------------------------
        // Method-2: Using formula (a + (n-1)d)
        // Example-1: Odd numbers -> 1, 3, 5, 7, ...
        // Here: a = 1, d = 2
        // --------------------------------------------------
        System.out.print("Method-2 (odd numbers, formula): ");
        for (int i = 1; i <= 2 * n - 1; i += 2) { // start=1, step=2
            System.out.print(i + " ");
        }
        System.out.println();

        // Example-2: AP with a = 4, d = 3
        // Formula: nth term = 4 + (n-1)*3
        System.out.print("Method-2 (a=4, d=3): ");
        for (int i = 4; i <= 3 * n + 1; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println();

        // --------------------------------------------------
        // Method-3: (for you to explore later!)
        // You could try direct formula evaluation in loop:
        // term = a + (i-1)*d
        // --------------------------------------------------
    }
}
