/*
 * Problem: Anonymous Arrays in Java
 *
 * Purpose:
 *   - Learn how to pass arrays directly to methods without storing them in variables.
 *   - Useful when the array is required only once (temporary use).
 *
 * Concept:
 *   - Normal array:
 *       int[] arr = {10, 20, 30};
 *       printArray(arr);
 *
 *   - Anonymous array:
 *       printArray(new int[]{10, 20, 30});
 *       → No reference variable created, directly passed.
 *
 * Example Output:
 *   10
 *   22
 *   44
 *   66
 */

package module_13_array;

public class J_10_AnonymousArray {

    // Method which receives an array as a parameter
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        // Passing anonymous array directly
        printArray(new int[]{10, 22, 44, 66});

        // --------------------------------------------------
        // Another Example: Sum of elements using anonymous array
        // --------------------------------------------------
        int sum = 0;
        for (int i : new int[]{5, 10, 15}) { // anonymous array in for-each
            sum += i;
        }
        System.out.println("Sum of elements = " + sum); // 30
    }
}

/*
 * Quick Notes for Revision:
 *  - Anonymous array → created without a name.
 *  - Syntax: new int[]{values...}
 *  - Used when:
 *      • Passing temporary array to a method.
 *      • No need to reuse the array later.
 *  - Limitation: Cannot reuse, since it has no reference.
 */
