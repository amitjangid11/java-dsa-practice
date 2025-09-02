package module_09_conditional_statement;

import java.util.Scanner;

public class J_08_GreatestOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Enter 1st Number : ");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        num2 = sc.nextInt();
        System.out.print("Enter 3rd Number : ");
        num3 = sc.nextInt();

        if (num1 > num2){
            if (num1 > num3){
                System.out.print(num1 + " is Greatest.");
            }
            else{
                System.out.print(num3 + " is Greatest.");
            }
        }else{
            if (num2 > num3){
                System.out.print(num2 + " is Greatest.");
            }else{
                System.out.print(num3 + " is Greatest.");
            }
        }
    }
}
