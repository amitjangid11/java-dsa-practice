package module_09_conditional_statement;

import java.util.Scanner;

public class J_09_GradeOfStudent {
    public static void main(String[] args) {
        System.out.println("Remark Scheme\n" +
                "1. Marks >= 90 --> A\n" +
                "2. Marks >= 80 --> B\n" +
                "3. Marks >= 70 --> C\n" +
                "4. Marks >= 60 --> D\n" +
                "5. Marks >= 50 --> E\n"
        );
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Marks : ");
        int marks = sc.nextInt();
        if (marks > 90) {
            System.out.println("You got Grade A");
        } else if (marks > 80) {
            System.out.println("You got Grade B");
        } else if (marks > 70) {
            System.out.println("You got Grade C");
        } else if (marks > 60) {
            System.out.println("You got Grade D");
        } else if (marks > 50) {
            System.out.println("You got Grade E");
        } else {
            System.out.println("You got Failed");
        }

    }
}
