package module_15_strings;

import java.util.Scanner;

/*
 * ===========================================================
 *                  FILE: J_01_Basic.java
 *
 *                  TOPIC: String Basics in Java
 *
 * -----------------------------------------------------------
 *                  PURPOSE / OBJECTIVES
 * -----------------------------------------------------------
 * 1) Understand how Strings work in Java (immutable, objects).
 * 2) Learn how to take string input using Scanner.
 * 3) Understand difference between next() and nextLine().
 * 4) Practice basic String operations like charAt().
 * 5) Build foundation for upcoming String DSA topics.
 *
 * -----------------------------------------------------------
 *                  STRUCTURE OF THIS FILE
 * -----------------------------------------------------------
 *  - Creating String literals
 *  - Using Scanner for string input
 *  - Understanding indexing in strings
 *  - Using charAt() to access characters
 *
 * -----------------------------------------------------------
 *                  KEY LEARNING POINTS
 * -----------------------------------------------------------
 *  - String is immutable.
 *  - String indexing starts from 0.
 *  - next() vs nextLine() difference is important.
 *  - charAt() returns a single character.
 * ===========================================================
 */

public class J_01_Basic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // --------------------------------------------------
        // 1) BASIC STRING CREATION
        // --------------------------------------------------
        // String literal - stored in String Constant Pool (SCP)
        String str = "Hello";

        // --------------------------------------------------
        // 2) INPUT METHODS FOR STRINGS (Scanner)
        // --------------------------------------------------
        /*
         * next():
         *   - Reads a single word.
         *   - Stops reading when a space is encountered.
         * Example:
         *   Input: "Hello World"
         *   Stored: "Hello"
         *
         * nextLine():
         *   - Reads the entire line including spaces.
         * Example:
         *   Input: "Hello World"
         *   Stored: "Hello World"
         */

        // Example usage (uncomment to test):
        // String str1 = sc.next();
        // String str2 = sc.nextLine();
        // System.out.println(str1);
        // System.out.println(str2);

        // --------------------------------------------------
        // 3) charAt(index)
        // --------------------------------------------------
        /*
         * charAt(index):
         *   - Returns the character at the given index.
         *   - String indexing starts from 0.
         *
         * For str = "Hello":
         *   Index positions:
         *     H -> 0
         *     e -> 1
         *     l -> 2
         *     l -> 3
         *     o -> 4
         */

        System.out.println(str.charAt(4));  // Output: 'o'

    }
}

/*
 * ===========================================================
 *                   QUICK REVISION NOTES
 * ===========================================================
 * ✔ String is immutable → cannot be changed once created.
 * ✔ String literal values are stored in String Constant Pool.
 * ✔ next() → reads one word.
 * ✔ nextLine() → reads full sentence including spaces.
 * ✔ charAt(i) → fetches character from index i.
 * ✔ String indexes: 0 to length-1.
 *
 * Extra Notes:
 * ✔ Use length() to get total characters.
 * ✔ Use substring() to extract parts of a string.
 * ✔ Use equals() for value comparison, not ==.
 * ===========================================================
 *
 * ===========================================================
 *             INTERVIEW QUESTIONS & ANSWERS
 * ===========================================================
 *
 * Q1) Why are Strings immutable in Java?
 * A1) For security, caching (String Pool), thread safety,
 *     and because many core classes depend on immutability.
 *
 * Q2) Difference between next() and nextLine()?
 * A2)
 *     next()     → reads only one word.
 *     nextLine() → reads entire line with spaces.
 *
 * Q3) What does charAt() do?
 * A3) It returns the character at the given index.
 *
 * Q4) What is String Constant Pool?
 * A4) A special memory area where Java stores reusable string literals
 *     to optimize memory and performance.
 *
 * Q5) Difference between == and equals() in Strings?
 * A5)
 *     ==       → compares memory references.
 *     equals() → compares actual string value.
 *
 * ===========================================================
 * END OF FILE
 * ===========================================================
 */
