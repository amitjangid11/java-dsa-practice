package module_15_strings;

/*
 * =====================================================================
 *                           FILE: J_04_Interning.java
 *
 *                           TOPIC: STRING INTERNING
 *
 * ---------------------------------------------------------------------
 *                         PURPOSE / OBJECTIVES
 * ---------------------------------------------------------------------
 * 1) Understand what String Interning is in Java.
 * 2) Learn how String literals are stored in the String Constant Pool (SCP).
 * 3) Understand how reassigning a String variable works internally.
 * 4) Build foundation for concepts like immutability, memory model,
 *    and optimization in Java.
 *
 * ---------------------------------------------------------------------
 *                         KEY CONCEPTS COVERED
 * ---------------------------------------------------------------------
 *  ✔ String Constant Pool (SCP)
 *  ✔ Interning of literals
 *  ✔ Immutability of Strings
 *  ✔ Reference reassignment (variable → new object)
 * =====================================================================
 */

public class J_04_Interning {
    public static void main(String[] args) {

        // ---------------------------------------------------------------
        // LITERAL CREATION
        // ---------------------------------------------------------------
        String str = "Raghav";
        /*
         When you write:
              String str = "Raghav";
         The literal "Raghav" is stored in the String Constant Pool (SCP).
         'str' now points to the memory location of the SCP object.
         */

        // ---------------------------------------------------------------
        // REASSIGNING STRING REFERENCE
        // ---------------------------------------------------------------
        str = "Madhav";
        /*
         IMPORTANT:
         - String is immutable → it cannot be changed.
         - When we assign "Madhav", a NEW literal is checked/created in SCP.
         - Now 'str' points to the new literal "Madhav".
         - The old literal "Raghav" remains in SCP (not deleted).
         */

        // No output is printed; this file is purely for memory demonstration.
    }
}

/*
 * =====================================================================
 *                         QUICK REVISION NOTES
 * =====================================================================
 *
 * ✔ String literals are stored in the String Constant Pool (SCP).
 * ✔ SCP ensures:
 *      - memory saving
 *      - reuse of identical string literals
 *
 * ✔ String is immutable:
 *      Changing a string does NOT modify the object.
 *      Instead, the reference now points to a new object.
 *
 * ✔ Example:
 *        String s = "A";
 *        s = "B";
 *   "A" still exists in SCP; s now points to "B".
 *
 * ✔ SCP vs Heap:
 *      Literals → SCP
 *      new String("abc") → Heap (plus optional SCP entry)
 *
 * =====================================================================
 *
 * =====================================================================
 *                    INTERVIEW QUESTIONS & ANSWERS
 * =====================================================================
 *
 * Q1) What is String Interning?
 * A1) Interning means storing only one copy of each literal in the
 *     String Constant Pool so duplicates are reused to save memory.
 *
 * Q2) Where are string literals stored?
 * A2) Inside the String Constant Pool (SCP), part of the JVM method area.
 *
 * Q3) What happens when you do:
 *         String s = "A";
 *         s = "B";
 *     ?
 * A3) "B" is checked/created in SCP, and s now points to "B",
 *     while "A" still remains in SCP.
 *
 * Q4) Why are Strings immutable?
 * A4) For memory optimization (String Pool), thread-safety, caching,
 *     and security (strings used in passwords, DB URLs, etc.)
 *
 * Q5) Difference between:
 *         String s = "A";
 *         String t = new String("A");
 *     ?
 * A5)
 *      s → points to SCP literal "A".
 *      t → creates a NEW object in heap, separate from SCP.
 *
 * Q6) What does intern() method do?
 * A6) Returns the SCP reference of the string. If not in SCP, adds it.
 *
 * =====================================================================
 * END OF FILE
 * =====================================================================
 */
