package module_11_methods;

import java.util.Scanner;

public class J_01_Basics_01 {
    public static void main(String[] args) {
        int ans= sum();
        System.out.println("Result : " + ans);

    }

    static int sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        return sum;
    }
}
