package module_09_conditional_statement;

import java.util.Scanner;

public class J_05_AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if (num < 0){
            System.out.println(-num);
        }
        else {
            System.out.println(num);
        }
    }
}
