package module_12_pattern_printing;

import java.util.Scanner;

public class J_02_Alphabet_Pattern {
    public static void main(String[] args) {
        System.out.print("Enter n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        alphabetRectangle(n);
    }

    static void alphabetRectangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
//                char ch = (char)(i + 65);
                char ch = (char)(j + 65);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
