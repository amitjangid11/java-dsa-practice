package module_08_basics;

import java.util.Scanner;

public class SquareOfInputNumber_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter floating number : ");
        double sqr = sc.nextDouble();
        System.out.println("Square of Entered number is : " + (sqr * sqr));
    }
}
