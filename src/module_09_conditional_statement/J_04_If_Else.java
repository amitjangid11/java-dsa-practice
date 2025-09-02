package module_09_conditional_statement;

import java.util.Scanner;

public class J_04_If_Else {
    public static void main(String[] args) {
        // Even-Odd
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}

