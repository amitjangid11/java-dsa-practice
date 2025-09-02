package module_10_loops;

import java.util.Scanner;

public class J_02_PrintOddEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("0 - Print Even Numbers (0 to 100)");
        System.out.println("1 - Print Odd Numbers (1 to 99)");
        System.out.print("Enter your choice (0 or 1): ");

        int choice = sc.nextInt();

        if (choice == 0) {
            printEven();
        } else if (choice == 1) {
            printOdd();
        } else {
            System.out.println("Invalid choice. Please enter 0 or 1.");
        }

        sc.close(); // Always good to close Scanner
    }

    static void printEven() {
        System.out.println("Even numbers from 0 to 100:");
        for (int i = 0; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void printOdd() {
        System.out.println("Odd numbers from 1 to 99:");
        for (int i = 1; i < 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static void printOneToHundred(){
        for (int i = 0; i <=100; i++) {
            System.out.println(i+" ");
        }
    }
}
