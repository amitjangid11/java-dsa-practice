/*
 * Problem: Understanding Basic Method Declaration and Calling
 *
 * Purpose:
 *   - Learn how to define and call a static method in Java.
 *   - Understand basic method structure and flow of execution.
 *
 * Concept:
 *   - Method Syntax:
 *       access_modifier static return_type methodName(parameters) {
 *           // method body
 *       }
 *
 *   - Here:
 *       • greet() → a static method
 *       • main() calls greet() directly (no object needed)
 */

package module_11_methods.more_on_function;

public class J_03_Basic2 {

    public static void main(String[] args) {
        greet(); // Method call
        greetUser("Amit"); // Calling method with parameter
    }

    // --------------------------------------------------
    // Simple method without parameters
    // --------------------------------------------------
    public static void greet() {
        System.out.println("Hello World");
    }

    // --------------------------------------------------
    // Method with parameter
    // --------------------------------------------------
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to Java learning.");
    }
}

/*
 * Quick Notes for Revision:
 *  - static → means method belongs to the class, not an object.
 *  - Method = reusable block of code that performs a specific task.
 *  - Types of methods:
 *      • Without parameters (e.g., greet())
 *      • With parameters (e.g., greetUser(String name))
 *      • With return value (e.g., int add(int a, int b))
 *  - main() method is always static because JVM calls it without creating an object.
 */
