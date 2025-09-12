/*
 * Problem: Print Odd Numbers from 1 to 100
 *
 * Purpose:
 *   - Learn how to use `continue` to skip unwanted iterations.
 *
 * Concept:
 *   - Odd numbers → numbers that are not divisible by 2.
 *   - Using continue: skip numbers when divisible by 2 (even).
 *
 * Example Output (first few terms):
 *   1 3 5 7 9 ... 99
 */

package module_10_loops.problems;

public class J_03_OddNumber_1_to_100 {
    public static void main(String[] args) {

        // --------------------------------------------------
        // Method 1: Using continue
        // --------------------------------------------------
        System.out.print("Odd Numbers (using continue): ");
        // 100 iterations
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue; // skip even numbers
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // --------------------------------------------------
        // Method 2: Without continue (direct step = 2)
        // Uncomment to use
        // --------------------------------------------------
        /*
        System.out.print("Odd Numbers (without continue): ");
        // 50 iterations
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        */

    }
}

/*
 * Quick Notes for Revision:
 *  - Odd → i % 2 != 0
 *  - continue → skip even numbers (i % 2 == 0).
 *  - Alternative: increment loop by 2 (faster, no continue needed).
 */
