/*
 * Problem: Passing Arguments to Methods
 *
 * Purpose:
 *   - Understand how to send data (arguments) to methods in Java.
 *   - Learn the difference between parameters and arguments.
 *
 * Concept:
 *   - Parameters → variables defined inside method parentheses.
 *   - Arguments → actual values passed when calling the method.
 *
 *   Example:
 *      public static void greet(String name) → "name" is parameter
 *      greet("Amit"); → "Amit" is argument
 */

package module_11_methods.more_on_function;

public class J_04_PassingArguments {

    public static void main(String[] args) {
        // Passing arguments (method calls)
        sum(10, 20);
        intro("Amit", 22);

        // Example: Using return value
        int result = multiply(5, 6);
        System.out.println("Product (with return value): " + result);
    }

    // --------------------------------------------------
    // Method with parameters (no return)
    // --------------------------------------------------
    public static void sum(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // --------------------------------------------------
    // Method with multiple parameters (no return)
    // --------------------------------------------------
    public static void intro(String name, int age) {
        System.out.println("Hello " + name + ", your age is " + age);
    }

    // --------------------------------------------------
    // Method with return value (for next concept)
    // --------------------------------------------------
    public static int multiply(int x, int y) {
        return x * y; // returns result back to caller
    }
}

/*
 * Quick Notes for Revision:
 *  - Parameter → variable in method definition.
 *  - Argument → actual value passed during call.
 *  - Methods can:
 *      • Take parameters (input)
 *      • Return values (output)
 *  - Use return keyword to send value back to caller.
 *
 * Interview Tip:
 *  - Java is *pass-by-value* → copies of arguments are passed, not actual variables.
 */
