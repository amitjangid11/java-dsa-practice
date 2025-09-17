/*
 * Problem: Efficient Input & Output for Arrays
 *
 * Purpose:
 *   - Learn how to take input for arrays using loops.
 *   - Practice efficient output with both for loop and for-each loop.
 *
 * Concept:
 *   - Arrays are fixed-size containers.
 *   - Instead of writing arr[0], arr[1]... use loops for input/output.
 *
 * Example Run:
 *   Enter Size of Array
 *   3
 *   Enter marks of Subject-1 : 50
 *   Enter marks of Subject-2 : 60
 *   Enter marks of Subject-3 : 70
 *
 *   Marks of Subject 1 is : 50
 *   Marks of Subject 2 is : 60
 *   Marks of Subject 3 is : 70
 */

package module_13_array;

import java.util.Scanner;

public class J_03_Efficient_input_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --------------------------------------------------
        // Step 1: Array declaration with user-defined size
        // --------------------------------------------------
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int[] marks = new int[n];

        // --------------------------------------------------
        // Step 2: Taking input using for loop
        // --------------------------------------------------
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks of Subject-" + (i + 1) + " : ");
            marks[i] = sc.nextInt();
        }

        // --------------------------------------------------
        // Method 1: Output using for loop (index-based)
        // --------------------------------------------------
        System.out.println("\nOutput (using for loop):");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks of Subject " + (i + 1) + " is : " + marks[i]);
        }

        // --------------------------------------------------
        // Method 2: Output using for-each loop (optimized)
        // --------------------------------------------------
        System.out.println("\nOutput (using for-each loop):");
        int subject = 1;
        for (int value : marks) {
            System.out.println("Marks of Subject " + subject + " is : " + value);
            subject++;
        }

        sc.close();
    }
}

/*
 * Quick Notes for Revision:
 *  - Input: use for loop (need index to know where to store values).
 *  - Output:
 *      for loop → use when you need index info.
 *      for-each → cleaner when you just need values.
 *  - Always close Scanner to prevent resource leaks.
 */
