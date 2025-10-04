/*
 * Problem: Introduction to Math Class in Java
 *
 * Purpose:
 *   - Learn how to use built-in mathematical functions in Java.
 *   - Understand common methods like pow(), sqrt(), abs(), floor(), max(), etc.
 *
 * Concept:
 *   - The Math class is part of java.lang package (auto imported).
 *   - All methods are static → called as Math.methodName().
 */

package module_11_methods.more_on_function;

import java.util.Scanner;

public class J_01_Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --------------------------------------------------
        // Manual power calculation (for understanding loops)
        // --------------------------------------------------
        /*
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double pow = 1;
        for (int i = 0; i < b; i++) {
            pow *= a;
        }
        System.out.println("Result (manual) = " + pow);
        */

        // --------------------------------------------------
        // Using built-in Math methods
        // --------------------------------------------------
        System.out.println("Math.pow(2, 10) = " + Math.pow(2, 10));      // 2^10 = 1024.0
        System.out.println("Math.sqrt(16) = " + Math.sqrt(16));          // √16 = 4.0
        System.out.println("Math.cbrt(8) = " + Math.cbrt(8));            // ∛8 = 2.0
        System.out.println("Math.abs(-8) = " + Math.abs(-8));            // |−8| = 8
        System.out.println("Math.floor(-3.14) = " + Math.floor(-3.14));  // round down → −4.0
        System.out.println("Math.max(4, 10) = " + Math.max(4, 10));      // greater of 4 and 10
        System.out.println("Math.min(4, 10) = " + Math.min(4, 10));      // smaller of 4 and 10
        System.out.println("Math.round(3.7) = " + Math.round(3.7));      // nearest whole number = 4
        System.out.println("Math.ceil(3.1) = " + Math.ceil(3.1));        // round up = 4.0
    }
}

/*
 * Quick Notes for Revision:
 *  - pow(a,b) → a raised to the power b
 *  - sqrt(x) → square root
 *  - cbrt(x) → cube root
 *  - abs(x) → absolute value (always positive)
 *  - floor(x) → rounds down to nearest integer
 *  - ceil(x) → rounds up to nearest integer
 *  - round(x) → nearest integer (normal rounding)
 *  - max(a,b), min(a,b) → comparison methods
 *
 * Interview Tip:
 *  - Math class = static methods, no need to create object.
 *  - Commonly used in DSA for calculations, geometry, and rounding.
 */
