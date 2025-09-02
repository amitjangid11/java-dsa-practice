package module_08_basics;

import java.util.Scanner;

public class UserInput_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Entered number is " + num);
    }
}
