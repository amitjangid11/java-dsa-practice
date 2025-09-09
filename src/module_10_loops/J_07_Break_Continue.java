/*
 * Mini Project: Understanding Break & Continue
 *
 * Concepts:
 *  - break → immediately exits the loop
 *  - continue → skips current iteration, moves to next
 *
 * This file combines:
 *  1. Basic number examples
 *  2. Real-world scenarios
 *
 * Sample Output:
 *   Break Example (basic): 0 1 2 3 4
 *   Continue Example (basic): 0 1 2 3 4 6 7 8 9
 *   Break Example (ticket counter): Ticket-1 Ticket-2 Ticket-3 Ticket-4 Ticket-5 Counter closed!
 *   Continue Example (working days): Day-1 Day-2 Day-3 Day-4 Day-5
 */

package module_10_loops;

public class J_07_Break_Continue {
    public static void main(String[] args) {

        // --------------------------------------------------
        // Basic Example: break
        // Print numbers 0 to 9, but stop loop at 5
        // --------------------------------------------------
        System.out.print("Break Example (basic): ");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // exit loop when i=5
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // --------------------------------------------------
        // Basic Example: continue
        // Print numbers 0 to 9, but skip printing 5
        // --------------------------------------------------
        System.out.print("Continue Example (basic): ");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue; // skip this iteration when i=5
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // --------------------------------------------------
        // Real-world Example: break
        // Scenario: Ticket counter sells only 5 tickets
        // --------------------------------------------------
        System.out.print("Break Example (ticket counter): ");
        int tickets = 0;
        for (int customer = 1; customer <= 100; customer++) {
            if (tickets == 5) {
                System.out.print("Counter closed!");
                break; // stop selling after 5 tickets
            }
            System.out.print("Ticket-" + customer + " ");
            tickets++;
        }
        System.out.println();

        // --------------------------------------------------
        // Real-world Example: continue
        // Scenario: Print working days (skip Saturday=6 and Sunday=7)
        // --------------------------------------------------
        System.out.print("Continue Example (working days): ");
        for (int day = 1; day <= 7; day++) {
            if (day == 6 || day == 7) {
                continue; // skip weekends
            }
            System.out.print("Day-" + day + " ");
        }
        System.out.println();
    }
}
