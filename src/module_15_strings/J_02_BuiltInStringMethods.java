package module_15_strings;

/*
 * ===============================================================
 *                 FILE: J_02_BuiltInStringMethods.java
 *
 *                     TOPIC: STRING METHODS IN JAVA
 *
 * ---------------------------------------------------------------
 *                        PURPOSE / OBJECTIVES
 * ---------------------------------------------------------------
 * 1) Learn commonly used built-in String methods in Java.
 * 2) Understand how to access characters, measure length,
 *    compare values, search within strings, and modify cases.
 * 3) Understand substring extraction and immutability effect.
 * 4) Build strong foundation for DSA string problems.
 *
 * ---------------------------------------------------------------
 *                      METHODS COVERED IN THIS FILE
 * ---------------------------------------------------------------
 *  - charAt()
 *  - length()
 *  - indexOf()
 *  - compareTo()
 *  - contains()
 *  - startsWith()
 *  - endsWith()
 *  - toLowerCase()
 *  - toUpperCase()
 *  - concat()
 *  - substring(i) and substring(i, j)
 *
 * ---------------------------------------------------------------
 *                         KEY LEARNING POINTS
 * ---------------------------------------------------------------
 *  ✔ All String methods create NEW Strings (because String is immutable)
 *  ✔ substring(i, j): i → inclusive, j → exclusive
 *  ✔ compareTo() returns:
 *        0  → strings are equal
 *       <0 → calling string is lexicographically smaller
 *       >0 → calling string is lexicographically larger
 *  ✔ contains() uses character sequence search (case-sensitive)
 * ===============================================================
 */

public class J_02_BuiltInStringMethods {
    public static void main(String[] args) {

        String name = "Amit Jangid";
        String a = "abc";
        String b = "dff";

        // ---------------------------------------------------------------
        // charAt()
        // Returns the character at the given index.
        // Index must be within [0, length-1], else IndexOutOfBoundsException.
        // ---------------------------------------------------------------
        System.out.println(name.charAt(3)); // J
        System.out.println(name.charAt(0)); // A
        // System.out.println(name.charAt(15));  // ❌ Error: index out of bounds

        // ---------------------------------------------------------------
        // length()
        // Returns number of characters in the string.
        // ---------------------------------------------------------------
        System.out.println(name.length()); // 11

        // ---------------------------------------------------------------
        // indexOf()
        // Returns first occurrence index of given character or substring.
        // Returns -1 if not found.
        // ---------------------------------------------------------------
        System.out.println(name.indexOf('a')); // index of first 'a'

        // ---------------------------------------------------------------
        // compareTo()
        // Lexicographical comparison (dictionary order)
        // a < b → negative
        // a = b → 0
        // a > b → positive
        // ---------------------------------------------------------------
        System.out.println(a.compareTo(b));

        // ---------------------------------------------------------------
        // contains()
        // Checks if substring exists in string (case-sensitive)
        // ---------------------------------------------------------------
        String contain = "Hello World";
        System.out.println(contain.contains("oWo")); // false
        System.out.println(contain.contains("H"));   // true
        System.out.println(contain.contains("ellw")); // false

        // ---------------------------------------------------------------
        // startsWith()
        // Checks prefix (case-sensitive)
        // ---------------------------------------------------------------
        String d = "Amit Jangid";
        System.out.println(d.startsWith("Amit"));       // true
        System.out.println(d.startsWith("mit Jangid")); // false

        // ---------------------------------------------------------------
        // endsWith()
        // Checks suffix (case-sensitive)
        // ---------------------------------------------------------------
        String e = "Amit Jangid";
        System.out.println(e.endsWith("it"));  // false
        System.out.println(e.endsWith("git")); // false

        // ---------------------------------------------------------------
        // toLowerCase() & toUpperCase()
        // Converts string case; original string remains unchanged (immutable)
        // ---------------------------------------------------------------
        System.out.println(e.toLowerCase()); // amit jangid
        System.out.println(e);               // Amit Jangid (unchanged)
        String smallCase = e.toLowerCase();
        System.out.println(smallCase);       // amit jangid

        System.out.println(e.toUpperCase()); // AMIT JANGID

        // ---------------------------------------------------------------
        // concat()
        // Joins two strings; returns NEW string
        // ---------------------------------------------------------------
        String f = "abc";
        String g = "def";
        System.out.println(f.concat(g)); // abcdef
        System.out.println(f);           // abc (unchanged)
        f = f.concat(g);
        System.out.println(f);           // abcdef (new string assigned)

        // ---------------------------------------------------------------
        // substring(i) & substring(i, j)
        // substring(i) → from i till end.
        // substring(i, j) → from i (inclusive) to j (exclusive).
        // ---------------------------------------------------------------
        String h = "abcdefg";
        System.out.println(h.substring(3));    // defg
        System.out.println(h.substring(3, 3)); // "" empty string
        System.out.println(h.substring(2, 6)); // cdef
        System.out.println(h.substring(2, 7)); // cdefg
    }
}

/*
 * ===============================================================
 *                     QUICK REVISION NOTES
 * ===============================================================
 * ✔ Strings are immutable — methods return NEW Strings.
 * ✔ charAt(i) → get character at index
 * ✔ length() → total characters
 * ✔ indexOf() → search only first occurrence
 * ✔ compareTo() → lexicographical comparison
 * ✔ contains() → case-sensitive substring check
 * ✔ startsWith() / endsWith() → prefix/suffix matching
 * ✔ toLowerCase() / toUpperCase() → do not modify original string
 * ✔ concat() → joins two strings, same as "+"
 * ✔ substring(i, j) → i inclusive, j exclusive
 * ===============================================================
 *
 * ===============================================================
 *                 INTERVIEW QUESTIONS & ANSWERS
 * ===============================================================
 *
 * Q1) Why are Strings immutable in Java?
 * A1) For security, String Pool optimization, caching, and thread safety.
 *
 * Q2) What is the difference between == and equals()?
 * A2) == compares references; equals() compares values.
 *
 * Q3) How does compareTo() work?
 * A3) It compares unicode values of characters lexicographically.
 *
 * Q4) Why is contains() case-sensitive?
 * A4) Because it checks character sequence exactly as given.
 *
 * Q5) What is substring(i, j) meaning?
 * A5) i → start index (included), j → end index (excluded).
 *
 * Q6) Why does concat() not change the original string?
 * A6) Because Strings are immutable; concat() creates a new string.
 *
 * Q7) What happens if substring(i, j) has i == j?
 * A7) It returns an empty string "".
 *
 * Q8) What exception does charAt() throw for invalid index?
 * A8) StringIndexOutOfBoundsException.
 *
 * ===============================================================
 * END OF FILE
 * ===============================================================
 */
