/*
 * Problem: Generate Pascal's Triangle
 *
 * Purpose:
 *   - Learn how to use combinations (nCr) to generate Pascal's Triangle.
 *   - Practice nested loops and method calls.
 *
 * Concept:
 *   - Each element in Pascal's Triangle = nCr (combination)
 *   - Formula: nCr = n! / (r! * (n - r)!)
 *
 * Example for 5 rows:
 *         1
 *        1 1
 *       1 2 1
 *      1 3 3 1
 *     1 4 6 4 1
 */

package module_11_methods.more_on_function.Questions;

public class J_03_PascalTriangle {
    public static void main(String[] args) {
        int rows = 5; // number of rows to print (you can make it user input)
        printPascalTriangle(rows);
    }

    // --------------------------------------------------
    // Method to print Pascal’s Triangle
    // --------------------------------------------------
    public static void printPascalTriangle(int rows) {
        for (int n = 0; n < rows; n++) {

            // Print leading spaces for pyramid shape
            for (int s = rows - n; s > 1; s--) {
                System.out.print(" ");
            }

            // Print combination values
            for (int r = 0; r <= n; r++) {
                System.out.print(combination(n, r) + " ");
            }

            System.out.println();
        }
    }

    // --------------------------------------------------
    // Combination formula (nCr)
    // --------------------------------------------------
    public static int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    // --------------------------------------------------
    // Factorial method
    // --------------------------------------------------
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

/*
 * Quick Notes for Revision:
 *  - Pascal’s Triangle = visual representation of nCr values.
 *  - nCr = n! / (r! × (n - r)!)
 *  - Each row starts and ends with 1.
 *  - Used in:
 *      • Probability
 *      • Binomial theorem expansion
 *      • Combinatorial problems
 *
 * Example (rows = 5):
 *         1
 *        1 1
 *       1 2 1
 *      1 3 3 1
 *     1 4 6 4 1
 */
