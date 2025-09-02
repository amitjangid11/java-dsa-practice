package module_13_array.questions;

// Q.1 Given an array of marks of students, if the mark of any student is less than 35 print its roll number.[roll number here refers to the index of the array.]

import java.util.Scanner;

public class J_01_MarksOfStudent {
    public static void main(String[] args) {
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);

        // taking marks input
        for (int i = 0; i < marks.length;i++){
            System.out.print("Enter marks of student " + (i+1) + " Outof 100 : ");
            marks[i] = sc.nextInt();
        }

        // Output
        System.out.println("Student who got less than 35 are :- ");
        for (int i = 0;i < marks.length;i++){
            if (marks[i] < 35){
                System.out.print("Roll number : "+(i+1)+"\n");
            }
        }
    }
}
