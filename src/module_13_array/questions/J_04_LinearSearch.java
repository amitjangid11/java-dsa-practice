package module_13_array.questions;

import java.util.Scanner;

public class J_04_LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter target Element :");
        int x = input.nextInt();

        System.out.print("Enter Array size :");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter Array elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // Searching
        //Method-2
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
               flag = true;
                break;
            }
        }
        if (flag == true){
            System.out.println("Element Found!");
        }else{
            System.out.println("Element not found!!");
        }
        //Method-1
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == x) {
//                System.out.println("Element Found at index " + i);
//                break;
//            }else {
//                System.out.println("Element not found");
//            }
//        }

    }
}
