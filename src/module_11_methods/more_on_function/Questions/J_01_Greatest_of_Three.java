package module_11_methods.more_on_function.Questions;

import java.util.Scanner;

public class J_01_Greatest_of_Three {
    public static void main(String[] args) {
        // Take 3 no. input and print greatest of them using builtin function
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Greatest : " + max);
    }
}
