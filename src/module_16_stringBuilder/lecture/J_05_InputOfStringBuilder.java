package module_16_stringBuilder.lecture;

import java.util.Scanner;

public class J_05_InputOfStringBuilder {
    public static void main(String[] args) {
//      Method-1
        Scanner sc = new Scanner(System.in);
//        StringBuilder sb1 = new StringBuilder(sc.nextLine());

//      Method-2
        String s = sc.nextLine();
        StringBuilder sb2 = new StringBuilder(s);
        System.out.println(sb2);
        sb2.setCharAt(0,'S');
        System.out.println(sb2);
    }
}
