/*
 * Problem: Understanding Return Type in Methods
 *
 * Purpose:
 *   - Learn how methods can return values back to the caller.
 *   - Understand difference between `void` and other return types.
 *
 * Concept:
 *   - A method may or may not return a value.
 *   - If it returns something → must specify the return type.
 *   - If not → use `void` keyword.
 *
 * Syntax:
 *   returnType methodName(parameters) {
 *       // logic
 *       return value;  // required only if returnType ≠ void
 *   }
 */

package module_11_methods.more_on_function;

public class J_05_ReturnType {

    public static void main(String[] args) {
        // --------------------------------------------------
        // 1️⃣ Method returning an integer
        // --------------------------------------------------
        int result = sum(2, 7);
        System.out.println("Sum result: " + result);

        // --------------------------------------------------
        // 2️⃣ Method returning a String
        // --------------------------------------------------
        String message = greet("Amit");
        System.out.println(message);

        // --------------------------------------------------
        // 3️⃣ Method returning nothing (void)
        // --------------------------------------------------
        displayInfo("Java", 21);
    }

    // --------------------------------------------------
    // Method 1 → Returns an integer
    // --------------------------------------------------
    public static int sum(int a, int b) {
        return a + b; // return value to caller
    }

    // --------------------------------------------------
    // Method 2 → Returns a String
    // --------------------------------------------------
    public static String greet(String name) {
        return "Hello, " + name + "! Welcome to Java methods.";
    }

    // --------------------------------------------------
    // Method 3 → Returns nothing (void)
    // --------------------------------------------------
    public static void displayInfo(String course, int days) {
        System.out.println("Course: " + course + " | Duration: " + days + " days");
    }
}

/*
 * Quick Notes for Revision:
 *  - `void` → method doesn’t return anything.
 *  - For non-void methods → must use `return` keyword.
 *  - Return type must match the type of value being returned.
 *      Example: `int` → return int value, `String` → return string.
 *
 *  - You can store the returned value in a variable:
 *      int x = sum(5, 3);
 *
 *  - You can also directly use it:
 *      System.out.println(sum(5, 3));
 *
 * Interview Tip:
 *  - Every method in Java must either:
 *       → return a value (non-void)
 *       → or perform an action (void)
 */
