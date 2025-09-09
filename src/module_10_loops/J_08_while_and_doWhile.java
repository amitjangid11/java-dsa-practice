/*
 * Topic: while loop vs do-while loop
 *
 * Concept:
 *  - while loop:
 *      → Entry-controlled (condition is checked first, then body executes)
 *      → May run 0 or more times
 *
 *  - do-while loop:
 *      → Exit-controlled (body executes once, then condition is checked)
 *      → Runs at least 1 time
 *
 * Example:
 *   while (condition) {
 *       // code
 *   }
 *
 *   do {
 *       // code
 *   } while (condition);
 */

package module_10_loops;

import java.util.Scanner;

public class J_08_while_and_doWhile {
    public static void main(String[] args) {

        // --------------------------------------------------
        // Example 1: while loop (print 1 to 5)
        // --------------------------------------------------
        System.out.print("While Loop Example: ");
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // --------------------------------------------------
        // Example 2: do-while loop (print 1 to 5)
        // --------------------------------------------------
        System.out.print("Do-While Loop Example: ");
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 5);
        System.out.println();

        // --------------------------------------------------
        // Example 3: Key Difference
        // while loop may NOT run at all
        // --------------------------------------------------
        int k = 10;
        System.out.print("While with false condition: ");
        while (k < 5) {
            System.out.print(k + " "); // won't run
        }
        System.out.println("(No output)");

        // do-while will run at least once
        System.out.print("Do-While with false condition: ");
        do {
            System.out.print(k + " "); // runs once even if condition is false
        } while (k < 5);
        System.out.println();

        // --------------------------------------------------
        // Mini Project: ATM Simulation
        // --------------------------------------------------
        /*
         * Problem Statement:
         *   - User starts with balance = 1000
         *   - Menu:
         *       1. Check Balance
         *       2. Deposit
         *       3. Withdraw
         *       4. Exit
         *   - Use do-while loop to keep showing menu until user exits
         */

        Scanner sc = new Scanner(System.in);
        int balance = 1000;
        int choice;

        System.out.println("\n=== ATM Simulation ===");
        do {
            // Display Menu
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your Balance: " + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Deposited: " + deposit);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    int withdraw = sc.nextInt();
                    if (withdraw > balance) {
                        System.out.println("Insufficient Balance!");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawn: " + withdraw);
                    }
                    break;

                case 4:
                    System.out.println("Exiting... Thank you for using ATM!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
