/*
 * Topic: Scope of Variables in Java
 *
 * Purpose:
 *   - To understand where (in which part of code) a variable can be accessed or modified.
 *   - Learn the difference between Local, Instance, and Block scope.
 *
 * Types of Scope:
 *   1. Local Variable → Declared inside a method, constructor, or block. Accessible only there.
 *   2. Instance Variable → Declared inside a class but outside any method. Belongs to the object.
 *   3. Block Scope → Variable declared inside `{}` (like inside an if/for block).
 */

package module_11_methods.more_on_function;

public class J_06_Scope_Of_Variable {

    // Instance Variable (Global to the class)
    int instanceValue = 50;

    public static void main(String[] args) {
        // Local variable → accessible only within main()
        int localValue = 10;
        System.out.println("Local Value (inside main): " + localValue);

        // Block Scope Example
        if (localValue > 5) {
            int blockValue = 20; // accessible only inside this if-block
            System.out.println("Block Value (inside if): " + blockValue);
        }

        // Uncommenting below line will cause ERROR because blockValue is not visible here
        // System.out.println(blockValue);

        // To access instance variable → need object
        J_06_Scope_Of_Variable obj = new J_06_Scope_Of_Variable();
        System.out.println("Instance Value (via object): " + obj.instanceValue);

        // Method scope example
        obj.showScope();
    }

    // Method demonstrating method scope
    void showScope() {
        int methodLocal = 99; // local to this method only
        System.out.println("Local Variable (inside showScope method): " + methodLocal);
        System.out.println("Accessing Instance Variable: " + instanceValue);
    }
}

/*
 * 🧠 Quick Notes for Revision:
 *  - Local variables → exist only during method/block execution.
 *  - Instance variables → belong to each object (separate copy per object).
 *  - Static variables (not shown here) → belong to the class (shared across all objects).
 *  - Scope determines variable lifetime and accessibility.
 *
 * 💡 Mini Recap:
 *     Class Scope   → variables shared by all (static)
 *     Object Scope  → variables unique to each object (instance)
 *     Method Scope  → variables usable only inside that method
 *     Block Scope   → usable only inside { } (like in if, for, while)
 */
