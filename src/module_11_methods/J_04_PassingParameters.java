package module_11_methods;

import java.util.Scanner;

public class J_04_PassingParameters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();
        int result = sum(num1, num2);
        System.out.println("Sum of two number is : " + result);
    }

    static int sum(int a, int b) {
        return a + b;
    }
}
