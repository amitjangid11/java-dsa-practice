package module_09_conditional_statement;

import java.util.Scanner;

public class J_02_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        if (n % 2 == 0) System.out.println(n + " is Even");
        if (n % 2 != 0) System.out.println(n + " is odd");

    }
}
