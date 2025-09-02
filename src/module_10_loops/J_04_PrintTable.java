package module_10_loops;

import java.util.Scanner;

public class J_04_PrintTable {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.print("Enter which table you want to print: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * num);
        }

    }
}
