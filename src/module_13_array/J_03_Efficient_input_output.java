package module_13_array;

import java.util.Scanner;

public class J_03_Efficient_input_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = sc.nextInt();
        int[] marks = new int[n];

        // Taking input using loops
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks of Subject-" + (i + 1) + " : ");
            marks[i] = sc.nextInt();
        }

        //output Using loop
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Marks of Subject " + (i + 1) + " is : " + marks[i] + "\n" );
//            System.out.println(marks[i]);
        }

    }
}
