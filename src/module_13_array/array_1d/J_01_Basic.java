/*
 * Problem: Array Basics in Java
 *
 * Purpose:
 *   - Learn array declaration, initialization, and updating.
 *   - Understand default values in arrays.
 *
 * Concept:
 *   - An array is a collection of elements of the same type, stored in contiguous memory.
 *   - Default values: For int → 0, float → 0.0, boolean → false, objects → null.
 *
 * Example Input/Output:
 *   Before Updation: 10 20 30 40 50
 *   After Updation:  100 200 300 400 500
 */

package module_13_array.array_1d;

public class J_01_Basic {
    public static void main(String[] args) {

        // --------------------------------------------------
        // Step 1: Declaration + Memory Allocation
        // --------------------------------------------------
        int[] arr = new int[5]; // default values = 0

        // Step 2: Initialization
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // --------------------------------------------------
        // Method 1: Manual Printing (concept focus)
        // --------------------------------------------------
        System.out.println("Before Updation (manual print):");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        // Step 3: Updating values
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        arr[4] = 500;

        System.out.println("After Updation (manual print):");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        // --------------------------------------------------
        // Method 2: Optimized Printing (using loop)
        // --------------------------------------------------
        System.out.print("After Updation (using loop): ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

/*
 * Quick Notes for Revision:
 *  - Array indexes start at 0 → last index = length - 1.
 *  - Default values: int=0, double=0.0, boolean=false, objects=null.
 *  - Use loops to avoid repeating System.out.println().
 */
