package module_16_stringBuilder.questions;

import java.util.Scanner;

public class J_01_UpdateString {
    public static void main(String[] args) {
//        Q. Input a string and update all the even positions in the string to character 'a'. Consider 0-based indexing.
        Scanner sc = new Scanner(System.in);
        String s = "Physics Wallah Skills"; // ahasaca aaalahaSaiala
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            if (i%2==0) str += "a";
            else str += s.charAt(i);
        }
        s = str;
        System.out.println(s);
    }
}
