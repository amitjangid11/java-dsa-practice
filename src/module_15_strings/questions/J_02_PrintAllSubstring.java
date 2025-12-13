package module_15_strings.questions;

import java.util.Scanner;

/*
 * =====================================================================
 *                       FILE: J_02_PrintAllSubstring.java
 *
 *                    TOPIC: PRINT ALL SUBSTRINGS OF A STRING
 *
 * ---------------------------------------------------------------------
 *                         PURPOSE / OBJECTIVES
 * ---------------------------------------------------------------------
 * 1) Understand how to generate all substrings of a string.
 * 2) Learn nested-loop technique for substring generation.
 * 3) Practice substring(i, j) → index rules (i inclusive, j exclusive).
 * 4) Strengthen foundation for advanced string problems (palindromes,
 *    longest substring, string window problems).
 *
 * ---------------------------------------------------------------------
 *                        STRUCTURE OF THE PROGRAM
 * ---------------------------------------------------------------------
 *  - Take input string
 *  - Use two nested loops:
 *        Outer loop: starting index (i)
 *        Inner loop: ending index (j)
 *  - Print substring(i, j) for all valid pairs
 *
 * ---------------------------------------------------------------------
 *                       KEY CONCEPTS COVERED
 * ---------------------------------------------------------------------
 *  ✔ String traversal
 *  ✔ substring(i, j)
 *  ✔ Nested loops
 *  ✔ Total substrings formula: n(n+1)/2
 * =====================================================================
 */

public class J_02_PrintAllSubstring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = sc.nextLine();
        int size = string.length();

        // ---------------------------------------------------------------
        // Nested loops to generate all substrings
        // ---------------------------------------------------------------
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j <= size; j++) {
                System.out.print(string.substring(i, j) + " ");
            }
            System.out.println();
        }
    }
}

/*
 * =====================================================================
 *                          QUICK REVISION NOTES
 * =====================================================================
 *
 * ✔ substring(i, j):
 *      i = start index (inclusive)
 *      j = end index (exclusive)
 *
 * ✔ Total substrings of length n = n(n+1)/2
 *
 * ✔ Nested loop pattern:
 *      for i → 0 to n-1
 *          for j → i+1 to n
 *
 * ✔ substring() creates a NEW string (String is immutable)
 *
 * =====================================================================
 *
 * =====================================================================
 *                     COMMON MISTAKES / PITFALLS
 * =====================================================================
 *
 * ❌ Using j < size instead of j <= size  → misses last substring
 * ❌ Using substring(i, i) expecting character → gives "" (empty string)
 * ❌ Forgetting that j is exclusive
 * ❌ Confusing substring with subsequence
 *
 * =====================================================================
 *
 * =====================================================================
 *                           PRACTICE QUESTIONS
 * =====================================================================
 *
 * Q1) Print only UNIQUE substrings of a string.
 * Q2) Print all substrings in reverse order.
 * Q3) Count how many substrings start with a vowel.
 * Q4) Print the longest palindrome substring.
 * Q5) Print all substrings of length K.
 *
 * =====================================================================
 *
 * =====================================================================
 *                         REAL-WORLD USE CASES
 * =====================================================================
 *
 * ✔ DNA Sequence analysis (bioinformatics)
 * ✔ Substring search in search engines
 * ✔ Pattern matching (e.g., "find all possible patterns")
 * ✔ NLP text windowing
 * ✔ Plagiarism detection systems
 *
 * =====================================================================
 *
 * =====================================================================
 *                         JVM INTERNAL NOTES
 * =====================================================================
 *
 * ✔ substring(i, j) copies characters into a NEW string (Java 7+)
 * ✔ Earlier JVM versions shared char arrays (caused memory leaks)
 * ✔ charAt() and substring() are both O(1) for access, but substring
 *   creation is O(k) because it copies k characters.
 *
 * =====================================================================
 *
 * =====================================================================
 *                 TIME & SPACE COMPLEXITY ANALYSIS
 * =====================================================================
 *
 * TIME COMPLEXITY:
 *    O(n²)
 *    - Two nested loops generate n(n+1)/2 substrings.
 *
 * SPACE COMPLEXITY:
 *    O(k) per substring (k = length of substring)
 *    Total memory created is large: Θ(n³) worst case (not stored, but created & printed)
 *
 * =====================================================================
 *
 * =====================================================================
 *              OPTIMIZED VERSION OF CODE (Alternative Approaches)
 * =====================================================================
 *
 * --------------------- Approach 1: Print without substring() ---------
 *    (Avoids creating new String objects repeatedly)
 *
 *    for (int i = 0; i < size; i++) {
 *        for (int j = i; j < size; j++) {
 *            for (int k = i; k <= j; k++) {
 *                System.out.print(string.charAt(k));
 *            }
 *            System.out.print(" ");
 *        }
 *        System.out.println();
 *    }
 *
 *    ✔ Avoids creation of many temporary string objects
 *    ✔ But still O(n³) time complexity
 *
 * --------------------- Approach 2: Using StringBuilder ---------------
 *
 *    for (int i = 0; i < size; i++) {
 *        StringBuilder sb = new StringBuilder();
 *        for (int j = i; j < size; j++) {
 *            sb.append(string.charAt(j));
 *            System.out.print(sb + " ");
 *        }
 *        System.out.println();
 *    }
 *
 *    ✔ More efficient: reuses same StringBuilder
 *    ✔ Reduces substring creation overhead
 *
 * =====================================================================
 * END OF FILE
 * =====================================================================
 */
