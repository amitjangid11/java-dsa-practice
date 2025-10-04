/*
 * Problem: Using if-else and Methods (Static vs Non-Static)
 *
 * Purpose:
 *   - Understand how methods work in Java.
 *   - Learn difference between static and non-static methods.
 *   - Practice conditional logic (if-else).
 *
 * Example:
 *   Input: a = 5, b = 3
 *   Output: logic() → 8, substract() → 2
 */

package module_11_methods.more_on_function;

public class J_02_Using_if_else {

    // --------------------------------------------------
    // Static Method → Can be called directly using class name
    // --------------------------------------------------
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    // --------------------------------------------------
    // Non-static Method → Needs object to call
    // --------------------------------------------------
    int substract(int a, int b) {
        int c;
        if (a > b) {
            c = a - b;
        } else {
            c = b - a;
        }
        return c;
    }

    public static void main(String[] args) {
        int a = 5, b = 3;

        // --------------------------------------------------
        // Calling Static Method (logic)
        // --------------------------------------------------
        int c = logic(a, b); // can call directly because it's static
        System.out.println("Result of logic(): " + c);

        // --------------------------------------------------
        // Calling Static Method Again
        // --------------------------------------------------
        int a1 = 10, b1 = 12;
        int c1 = logic(a1, b1);
        System.out.println("Result of logic() with new values: " + c1);

        // --------------------------------------------------
        // Calling Non-static Method (substract)
        // --------------------------------------------------
        J_02_Using_if_else obj = new J_02_Using_if_else(); // object creation
        int result = obj.substract(a, b); // called using object
        System.out.println("Result of substract(): " + result);
    }
}

/*
 * Quick Notes for Revision:
 *  - static method → belongs to class (no object needed)
 *      → called as logic(a, b) or ClassName.logic(a, b)
 *
 *  - non-static method → belongs to object
 *      → must create object first: obj.methodName()
 *
 *  - if-else → executes one block depending on condition.
 *      if (condition) { ... } else { ... }
 *
 * Interview Tip:
 *  - Static methods are stored in class memory.
 *  - Non-static methods are tied to instance (object).
 *  - Use static for utility/helper methods that don't depend on object data.
 */
