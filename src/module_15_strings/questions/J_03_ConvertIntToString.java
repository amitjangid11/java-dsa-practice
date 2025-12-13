package module_15_strings.questions;

import java.util.Scanner;

/*
 * =====================================================================
 *                      FILE: J_03_ConvertIntToString.java
 *
 *                   TOPIC: INTEGER → STRING CONVERSION
 *
 * ---------------------------------------------------------------------
 *                          PURPOSE / OBJECTIVES
 * ---------------------------------------------------------------------
 * 1) Learn different ways to convert an integer into a String.
 * 2) Understand how concatenation with "" works.
 * 3) Learn standard Java methods for numeric-to-string conversions.
 * 4) Build foundation for parsing & string manipulation in DSA problems.
 *
 * ---------------------------------------------------------------------
 *                          STRUCTURE OF PROGRAM
 * ---------------------------------------------------------------------
 *  - Take integer input
 *  - Convert integer to string using concatenation
 *  - Display the string
 *
 * ---------------------------------------------------------------------
 *                       KEY CONCEPTS COVERED
 * ---------------------------------------------------------------------
 *  ✔ Numeric → String conversion
 *  ✔ String concatenation behavior
 *  ✔ Alternative methods: valueOf(), toString(), formatting
 * =====================================================================
 */

public class J_03_ConvertIntToString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        // ---------------------------------------------------------------
        // Method 1: Using concatenation → "" + number
        // (Most common in competitive programming)
        // ---------------------------------------------------------------
        String s = "" + a;

        System.out.println("Converted String: " + s);
    }
}

/*
 * =====================================================================
 *                           QUICK REVISION NOTES
 * =====================================================================
 *
 * ✔ "" + number → Fast, simple way to convert integer to string.
 *
 * ✔ Other ways:
 *     1) String.valueOf(a);
 *     2) Integer.toString(a);
 *     3) String.format("%d", a);
 *
 * ✔ Converting to string is useful in:
 *     - Digit extraction
 *     - Reversing number
 *     - Pattern matching
 *
 * =====================================================================
 *
 * =====================================================================
 *                    COMMON MISTAKES / PITFALLS
 * =====================================================================
 *
 * ❌ Using toString() on primitive:
 *        a.toString();  // ERROR (int is not an object)
 *
 * ❌ Forgetting that "" + number creates a NEW string every time.
 *
 * ❌ Thinking String s = "" + a modifies integer 'a' (it does NOT).
 *
 * =====================================================================
 *
 * =====================================================================
 *                           PRACTICE QUESTIONS
 * =====================================================================
 *
 * Q1) Convert string "12345" into integer without using parseInt().
 * Q2) Convert integer to binary string manually (without Integer.toBinaryString()).
 * Q3) Convert integer to string by extracting digits one by one.
 * Q4) Check if a number is palindrome using String conversion.
 * Q5) Count number of digits in integer using string conversion.
 *
 * =====================================================================
 *
 * =====================================================================
 *                         REAL-WORLD USE CASES
 * =====================================================================
 *
 * ✔ Printing numbers in logs/user interfaces
 * ✔ Formatting reports (PDF/Excel/HTML)
 * ✔ Network data transmission (numbers often sent as strings)
 * ✔ Saving numeric IDs into databases as VARCHAR fields
 *
 * =====================================================================
 *
 * =====================================================================
 *                         JVM INTERNAL NOTES
 * =====================================================================
 *
 * ✔ "" + a uses StringBuilder internally:
 *       new StringBuilder().append("").append(a).toString()
 *
 * ✔ Integer.toString(a) is fast and optimized in JVM.
 *
 * ✔ String.valueOf(a) internally calls Integer.toString(a).
 *
 * =====================================================================
 *
 * =====================================================================
 *                  TIME & SPACE COMPLEXITY ANALYSIS
 * =====================================================================
 *
 * ✔ TIME COMPLEXITY:  O(d)
 *        where d = number of digits in integer
 *
 * ✔ SPACE COMPLEXITY: O(d)
 *        storing converted string
 *
 * =====================================================================
 *
 * =====================================================================
 *           OPTIMIZED VERSION OF CODE (Alternative Approaches)
 * =====================================================================
 *
 * ---------------------- Approach 1: valueOf() -------------------------
 *
 * String s = String.valueOf(a);
 *
 * ---------------------- Approach 2: Integer.toString() ---------------
 *
 * String s = Integer.toString(a);
 *
 * ---------------------- Approach 3: String.format() ------------------
 *
 * String s = String.format("%d", a);
 *
 * ---------------------- Approach 4: Manual Conversion ----------------
 *
 * StringBuilder sb = new StringBuilder();
 * int num = a;
 * if (num == 0) sb.append(0);
 * while (num > 0) {
 *     int digit = num % 10;
 *     sb.append((char)('0' + digit)); // convert digit to character
 *     num /= 10;
 * }
 * sb.reverse();
 * String s = sb.toString();
 *
 * =====================================================================
 * END OF FILE
 * =====================================================================
 */
