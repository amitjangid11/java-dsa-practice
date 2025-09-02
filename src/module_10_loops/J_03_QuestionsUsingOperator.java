package module_10_loops;

import java.util.Scanner;

public class J_03_QuestionsUsingOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to count digits : ");
        int n = sc.nextInt();
        countDigit(n);
    }

    //WAP to count digits of a given number.
    static void countDigit(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        System.out.println("Number of Digit : " + count);
    }
}
