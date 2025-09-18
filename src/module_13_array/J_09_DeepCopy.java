/*
 * Problem: Deep Copy of Array (Manual Implementation)
 *
 * Purpose:
 *   - Learn how to create a deep copy of an array without using built-in methods.
 *
 * Concept:
 *   - Deep copy means creating a NEW independent array and copying each element.
 *   - This ensures that changes in the original array do not affect the copy.
 *
 * Example Output:
 *   arr[0] modified = 10
 *   brr[0] remains = 1
 */

package module_13_array;

public class J_09_DeepCopy {
    public static void main(String[] args) {

        // Original array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // --------------------------------------------------
        // Manual deep copy using loop
        // --------------------------------------------------
        int[] brr = new int[arr.length]; // new array created
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i]; // copy each element
        }

        // Modify original array
        arr[0] = 10;

        // Show that brr is not affected
        System.out.println("arr[0] = " + arr[0]); // 10
        System.out.println("brr[0] = " + brr[0]); // 1

        // Print both arrays
        System.out.print("Original (arr): ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Deep Copy (brr): ");
        for (int i : brr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // --------------------------------------------------
        // Alternative: Using Arrays.copyOf() (commented)
        // --------------------------------------------------
        /*
        int[] crr = java.util.Arrays.copyOf(arr, arr.length);
        */
    }
}

/*
 * Quick Notes for Revision:
 *  - Deep Copy (manual): create new array + copy elements with loop.
 *  - Change in original does not affect copy.
 *  - Alternative: Arrays.copyOf(arr, arr.length).
 *  - For multi-dimensional arrays, manual nested loop is needed for true deep copy.
 */
