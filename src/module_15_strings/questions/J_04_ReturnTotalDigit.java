package module_15_strings.questions;

import java.util.Scanner;

/*
 * =====================================================================
 *                      FILE: J_04_ReturnTotalDigit.java
 *
 *                  TOPIC: COUNT DIGITS WITHOUT USING LOOPS
 *
 * ---------------------------------------------------------------------
 *                           PURPOSE / OBJECTIVES
 * ---------------------------------------------------------------------
 * 1) Count the total number of digits in an integer WITHOUT using loops.
 * 2) Learn how converting a number to a String helps in digit counting.
 * 3) Practice different number-to-string conversion methods.
 * 4) Understand handling of negative numbers in digit counting.
 *
 * ---------------------------------------------------------------------
 *                         STRUCTURE OF PROGRAM
 * ---------------------------------------------------------------------
 *  - Input integer n
 *  - Convert n → String using two methods
 *  - Use length() to count digits
 *
 * ---------------------------------------------------------------------
 *                        KEY CONCEPTS COVERED
 * ---------------------------------------------------------------------
 *  ✔ Conversion of integer → string
 *  ✔ length() method
 *  ✔ Handling negative numbers
 *  ✔ Without using loops or math operations
 * =====================================================================
 */

public class J_04_ReturnTotalDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n1 = sc.nextInt();

        // ---------------------------------------------------------------
        // Method 1: Using concatenation ("" + n)
        // Converts integer to string automatically
        // ---------------------------------------------------------------
        String str1 = "" + n1;
        int digits1 = (n1 < 0) ? str1.length() - 1 : str1.length();
        // subtract 1 for '-' sign if number is negative

        System.out.println("Total Digits (Method-1): " + digits1);

        // ---------------------------------------------------------------
        // Method 2: Using Integer.toString()
        // More readable and recommended in real applications
        // ---------------------------------------------------------------
        String str2 = Integer.toString(n1);
        int digits2 = (n1 < 0) ? str2.length() - 1 : str2.length();

        System.out.println("Total Digits (Method-2): " + digits2);
    }
}

/*
 * =====================================================================
 *                           QUICK REVISION NOTES
 * =====================================================================
 *
 * ✔ "" + number  → fastest and simplest conversion.
 * ✔ Integer.toString(number) → clean and readable approach.
 * ✔ Digit count = length of string (minus 1 if negative).
 * ✔ No loops or arithmetic operations required.
 *
 * Example:
 *     n = 12345 → digit count = 5
 *     n = -987  → digit count = 3 (after removing '-')
 *
 * =====================================================================
 *
 * =====================================================================
 *                    COMMON MISTAKES / PITFALLS
 * =====================================================================
 *
 * ❌ Forgetting to handle negative numbers ("-123" has length 4)
 * ❌ Using n.toString() → ERROR (primitive 'int' has no methods)
 * ❌ Assuming Integer.toString() is slower than "" + n (it is optimized)
 * ❌ Thinking length() of integer exists → it exists only for String
 *
 * =====================================================================
 *
 * =====================================================================
 *                           PRACTICE QUESTIONS
 * =====================================================================
 *
 * Q1) Count digits WITHOUT converting to string and WITHOUT loops.
 *     (Hint: Use logarithm: (int)Math.log10(n)+1)
 *
 * Q2) Count digits of a long value.
 *
 * Q3) Check if a number has 3 digits using string conversion.
 *
 * Q4) Remove digits from a string and print digit count.
 *
 * Q5) Count digits in a number including leading/trailing spaces.
 *
 * =====================================================================
 *
 * =====================================================================
 *                        REAL-WORLD USE CASES
 * =====================================================================
 *
 * ✔ Validating input (e.g., mobile number must be 10 digits)
 * ✔ Bank account formats
 * ✔ ID or OTP processing
 * ✔ Converting numeric values before serialization
 *
 * =====================================================================
 *
 * =====================================================================
 *                         JVM INTERNAL NOTES
 * =====================================================================
 *
 * ✔ "" + n uses:
 *        new StringBuilder().append(n).toString();
 *
 * ✔ Integer.toString(n) is highly optimized inside JVM.
 *
 * ✔ Strings are immutable → each conversion creates a new String object.
 *
 * =====================================================================
 *
 * =====================================================================
 *                  TIME & SPACE COMPLEXITY ANALYSIS
 * =====================================================================
 *
 * TIME COMPLEXITY:
 *     O(d) — creating string representation of number (d = digits)
 *
 * SPACE COMPLEXITY:
 *     O(d) — storing the string
 *
 * =====================================================================
 *
 * =====================================================================
 *            OPTIMIZED VERSION OF CODE (Alternative Approaches)
 * =====================================================================
 *
 * ----------------------- Approach 1: Using valueOf() ------------------
 *
 * int digits = (n < 0)
 *              ? String.valueOf(n).length() - 1
 *              : String.valueOf(n).length();
 *
 * ---------------------- Approach 2: Using Math.log10() ----------------
 *
 * if (n == 0) digits = 1;
 * else digits = (int)Math.log10(Math.abs(n)) + 1;
 *
 * ✔ Very fast (no string creation)
 * ✔ Works only for positive integers (handle 0 separately)
 *
 * ---------------------- Approach 3: Convert manually ------------------
 *
 * int digits = 0;
 * int temp = Math.abs(n);
 * while (temp > 0) {
 *     digits++;
 *     temp /= 10;
 * }
 *
 * =====================================================================
 * END OF FILE
 * =====================================================================
 */
