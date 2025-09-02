package module_09_conditional_statement;

import java.util.Scanner;

public class J_06_ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price of Product X : ");
        int C_P = sc.nextInt();
        System.out.print("Enter Selling Price of Product X : ");
        int S_P = sc.nextInt();

        if (C_P > S_P) {
            System.out.println("You incurred the loss of " + (C_P - S_P));
        } else {
            if (S_P > C_P) {
                System.out.println("You made a Profit of " + (S_P - C_P));
            } else {
                System.out.println("Breakeven(No profit, no loss)");
            }
        }
    }
}
