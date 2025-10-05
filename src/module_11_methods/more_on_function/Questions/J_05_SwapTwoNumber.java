/*
 * Problem: Swap Two Numbers
 *
 * Purpose:
 *   - Learn multiple ways to swap variables in Java.
 *   - Understand concept of Pass by Value (important for interviews).
 *
 * Concepts Practiced:
 *   - Temporary variable method
 *   - Arithmetic method (no extra variable)
 *   - Using function (parameter passing)
 *
 * Example:
 *   Input: a = 5, b = 10
 *   Output:
 *      Using Temp Variable → a = 10, b = 5
 *      Using Arithmetic → a = 5, b = 10
 */

package module_11_methods.more_on_function.Questions;

import java.util.Scanner;

public class J_05_SwapTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        System.out.println("\nBefore Swap: a = " + a + ", b = " + b);

        // --------------------------------------------------
        // Method 1: Using Temporary Variable
        // --------------------------------------------------
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap (Method 1 - Temp Var): a = " + a + ", b = " + b);

        // --------------------------------------------------
        // Method 2: Without Temporary Variable (Arithmetic)
        // --------------------------------------------------
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap (Method 2 - Arithmetic): a = " + a + ", b = " + b);

        // --------------------------------------------------
        // Method 3: Using Function (but note → Pass by Value)
        // --------------------------------------------------
        swap(a, b);
        System.out.println("After Swap (Method 3 - Function): a = " + a + ", b = " + b);
        // ⚠️ Output will be same as before because Java is Pass-by-Value.
    }

    // --------------------------------------------------
    // Swap Function
    // --------------------------------------------------
    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Inside Function: a = " + a + ", b = " + b);
    }
}

/*
 * 🧠 Quick Notes for Revision:
 *  - Java is strictly **Pass by Value**, even for objects (values of references are copied).
 *  - Method 1 → safest & most readable.
 *  - Method 2 → no extra space used, but can cause overflow for large numbers.
 *  - Method 3 → doesn’t affect original values (because of pass-by-value behavior).
 *
 * 🧩 Interview Tip:
 *   - If interviewer asks why function didn’t work, answer:
 *     “Because Java passes a copy of the variable, not the original variable itself.”
 */
