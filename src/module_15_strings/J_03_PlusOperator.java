package module_15_strings;

/*
 * ===============================================================
 *                     FILE: J_03_PlusOperator.java
 *
 *                       TOPIC: PLUS (+) OPERATOR IN JAVA
 *
 * ---------------------------------------------------------------
 *                     PURPOSE / OBJECTIVES
 * ---------------------------------------------------------------
 * 1) Understand how the + operator behaves with:
 *       • Numbers
 *       • Characters
 *       • Strings
 *       • Mixed expressions (numbers + strings)
 * 2) Learn how Java handles String concatenation internally.
 * 3) Understand left-to-right evaluation for + operator when
 *    Strings are involved.
 * 4) Predict tricky outputs involving "abc" + 10 + 20.
 *
 * ---------------------------------------------------------------
 *                        KEY CONCEPTS COVERED
 * ---------------------------------------------------------------
 *  ✔ Numeric addition
 *  ✔ Character addition (ASCII/Unicode numeric values)
 *  ✔ String concatenation
 *  ✔ Mixed operations: number + string + number
 *  ✔ Evaluation order rules for the + operator
 * ===============================================================
 */

public class J_03_PlusOperator {
    public static void main(String[] args) {

        // ----------------------------------------------------------
        // 1) NUMBER + NUMBER → Arithmetic Addition
        // ----------------------------------------------------------
        System.out.println(10 + 20);  // 30

        // ----------------------------------------------------------
        // 2) CHAR + CHAR → Numeric addition using ASCII values
        // ----------------------------------------------------------
        System.out.println('A' + 'B'); // 65 + 66 = 131

        // ----------------------------------------------------------
        // 3) NUMBER + CHAR → Numeric addition (char → ASCII)
        // ----------------------------------------------------------
        System.out.println(10 + 'A'); // 10 + 65 = 75

        // ----------------------------------------------------------
        // 4) STRING + STRING → Concatenation
        // ----------------------------------------------------------
        System.out.println("Hello" + "World"); // HelloWorld

        // ----------------------------------------------------------
        // 5) STRING + NUMBER → Convert number to string → Concatenate
        // ----------------------------------------------------------
        System.out.println("Value = " + 100); // Value = 100

        // ----------------------------------------------------------
        // 6) NUMBER + NUMBER + STRING
        // ----------------------------------------------------------
        System.out.println(10 + 20 + "abc");
        // 10 + 20 = 30 → 30 + "abc" = "30abc"

        // ----------------------------------------------------------
        // 7) STRING + NUMBER + NUMBER
        // ----------------------------------------------------------
        System.out.println("abc" + 10 + 20);
        // "abc" + 10 = "abc10"
        // "abc10" + 20 = "abc1020"

        // ----------------------------------------------------------
        // 8) STRING + (NUMBER + NUMBER)
        // ----------------------------------------------------------
        System.out.println("abc" + (10 + 20));
        // 10 + 20 = 30 → "abc30"

        // ----------------------------------------------------------
        // 9) CHAR + STRING
        // ----------------------------------------------------------
        System.out.println('A' + "BC"); // ABC

        // ----------------------------------------------------------
        // 10) NUMBER + STRING + NUMBER + STRING
        // ----------------------------------------------------------
        System.out.println(1 + "a" + 2 + "b"); // 1a2b

        // ----------------------------------------------------------
        // TRICKY OUTPUT PREDICTION FROM CLASS QUESTION
        // ----------------------------------------------------------
        System.out.println("abc" + 10 + 20);  // abc1020
        System.out.println(10 + 20 + "abc");  // 30abc
    }
}

/*
 * ===============================================================
 *                    QUICK REVISION NOTES — PLUS OPERATOR
 * ===============================================================
 * ✔ + is overloaded in Java (only operator that works on Strings).
 *
 * ✔ With numbers   → arithmetic addition.
 * ✔ With chars     → ASCII/Unicode numeric addition.
 * ✔ With Strings   → concatenation.
 *
 * ✔ Evaluation is LEFT → RIGHT.
 *   Example:
 *       "abc" + 10 + 20
 *       → "abc10" + 20
 *       → "abc1020"
 *
 * ✔ Parentheses change the evaluation order.
 *       "abc" + (10 + 20)
 *       → "abc30"
 *
 * ✔ Any value + String → becomes String.
 *
 * ===============================================================
 *
 * ===============================================================
 *                INTERVIEW QUESTIONS & ANSWERS
 * ===============================================================
 *
 * Q1) Is + operator overloaded in Java?
 * A1) Yes, but only for String concatenation. Java does NOT support
 *     user-defined operator overloading.
 *
 * Q2) How does + work with Strings?
 * A2) JVM uses StringBuilder internally:
 *         "a" + b + c  →  new StringBuilder().append("a").append(b).append(c)
 *
 * Q3) Why does "abc" + 10 + 20 give "abc1020"?
 * A3) Evaluation is left to right:
 *         "abc" + 10 = "abc10"
 *         "abc10" + 20 = "abc1020"
 *
 * Q4) Why does 10 + 20 + "abc" give "30abc"?
 * A4) First numbers add:
 *         10 + 20 = 30
 *     Then 30 + "abc" → "30abc".
 *
 * Q5) What is the output of:
 *         'A' + "B"?
 * A5) "AB" — char is converted to String before concatenation.
 *
 * Q6) What is the output of:
 *         'A' + 'B'?
 * A6) 65 + 66 = 131 → numeric addition.
 *
 * ===============================================================
 * END OF FILE
 * ===============================================================
 */
