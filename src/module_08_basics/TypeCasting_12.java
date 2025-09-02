package module_08_basics;

import java.util.Scanner;

public class TypeCasting_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double db = (double) a;
        System.out.println(db / 2);

//        double dd = sc.nextDouble();
//        int aa = (int) dd;
//        System.out.println(aa / 2);
    }
}
