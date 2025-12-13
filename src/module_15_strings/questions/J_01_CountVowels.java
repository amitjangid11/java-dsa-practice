package module_15_strings.questions;

/*
 * =====================================================================
 *                      FILE: J_01_CountVowels.java
 *
 *                     TOPIC: Count Vowels in a String
 *
 * ---------------------------------------------------------------------
 *                       PURPOSE / OBJECTIVES
 * ---------------------------------------------------------------------
 * 1) Count total vowels (a, e, i, o, u) in a given string.
 * 2) Practice string traversal and character extraction.
 * 3) Understand helper method usage (isVowel).
 * 4) Learn clean conditional checking patterns.
 * ---------------------------------------------------------------------
 *                     STRUCTURE OF THIS PROGRAM
 * ---------------------------------------------------------------------
 *  - Step 1: Take a string (literal).
 *  - Step 2: Loop through all characters.
 *  - Step 3: Use isVowel() helper to check if a character is a vowel.
 *  - Step 4: Count and print result.
 *
 * ---------------------------------------------------------------------
 *                       KEY CONCEPTS COVERED
 * ---------------------------------------------------------------------
 *  ✔ charAt(i) — access characters
 *  ✔ length() — size of string
 *  ✔ Helper method usage
 *  ✔ Lowercase + uppercase handling
 *  ✔ Clean looping technique
 * =====================================================================
 */

public class J_01_CountVowels {
    public static void main(String[] args) {

        String s = "Amit Jangid is a Student";
        int size = s.length();
        int count = 0;

        // ---------------------------------------------------------------
        // Loop through each character and count vowels
        // ---------------------------------------------------------------
        for (int i = 0; i < size; i++) {
            char ch = s.charAt(i);
            if (isVowel(ch)) count++;
        }

        System.out.println("Total Vowel : " + count);
    }

    // ---------------------------------------------------------------
    // Helper method: returns true if character is a vowel (case-insensitive)
    // ---------------------------------------------------------------
    public static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'A' ||
                ch == 'e' || ch == 'E' ||
                ch == 'i' || ch == 'I' ||
                ch == 'o' || ch == 'O' ||
                ch == 'u' || ch == 'U');
    }
}

/*
 * =====================================================================
 *                         QUICK REVISION NOTES
 * =====================================================================
 *
 * ✔ Traversing string → use for-loop and charAt(i)
 * ✔ Vowel check → best done in helper method
 * ✔ String is immutable → reading characters is safe and fast
 * ✔ Counting vowels is O(n) operation
 * ✔ Avoid using substring() here — charAt() is faster
 *
 * =====================================================================
 *
 * =====================================================================
 *                    COMMON MISTAKES / PITFALLS
 * =====================================================================
 *
 * ❌ Checking only lowercase vowels (missing uppercase)
 * ❌ Using == for String comparison (not needed here but common mistake)
 * ❌ Forgetting to count 'A', 'E', 'I', 'O', 'U'
 * ❌ Converting whole string to lowercase inside loop (slows program)
 *
 * =====================================================================
 *
 * =====================================================================
 *                           PRACTICE QUESTIONS
 * =====================================================================
 *
 * Q1) Count consonants instead of vowels.
 * Q2) Count vowels without using a helper method.
 * Q3) Write a version that ignores spaces and numbers.
 * Q4) Write a version that prints each vowel and its index.
 * Q5) Count *unique* vowels in the string.
 *
 * =====================================================================
 *
 * =====================================================================
 *                       REAL-WORLD USE CASES
 * =====================================================================
 *
 * ✔ Text analysis in NLP (Natural Language Processing)
 * ✔ Spell-check systems
 * ✔ Voice synthesis & pronunciation tools
 * ✔ Data cleaning in text-heavy applications
 *
 * =====================================================================
 *
 * =====================================================================
 *                         JVM INTERNAL NOTES
 * =====================================================================
 *
 * ✔ charAt(i) gives direct access to internal char array (O(1)).
 * ✔ Strings are stored in heap/SCP but charAt does not create new objects.
 * ✔ Looping over characters is efficient due to compact internal storage.
 *
 * =====================================================================
 *
 * =====================================================================
 *                  TIME & SPACE COMPLEXITY ANALYSIS
 * =====================================================================
 *
 * TIME COMPLEXITY:  O(n)
 *    - We traverse the entire string once.
 *
 * SPACE COMPLEXITY: O(1)
 *    - Only 'count' and local variables are used.
 *
 * =====================================================================
 *
 * =====================================================================
 *           OPTIMIZED VERSION OF CODE (Alternative Approaches)
 * =====================================================================
 *
 * -------------------- Approach 1: Using toLowerCase() (Cleaner) --------
 *
 * public static boolean isVowel(char ch) {
 *     ch = Character.toLowerCase(ch);  // Converts to lowercase once
 *     return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
 * }
 *
 * -------------------- Approach 2: Using Set<Character> -----------------
 *
 * static Set<Character> vowels = Set.of('a','e','i','o','u');
 *
 * public static boolean isVowel(char ch) {
 *     return vowels.contains(Character.toLowerCase(ch));
 * }
 *
 * (Cleaner and scalable, but slightly slower than simple if-conditions)
 *
 * -------------------- Approach 3: Stream API (not recommended for DSA) -
 *
 * long count = s.chars()
 *              .mapToObj(c -> (char) c)
 *              .filter(ch -> "aeiouAEIOU".indexOf(ch) != -1)
 *              .count();
 *
 * (Readable but slower compared to loop)
 *
 * =====================================================================
 * END OF FILE
 * =====================================================================
 */
