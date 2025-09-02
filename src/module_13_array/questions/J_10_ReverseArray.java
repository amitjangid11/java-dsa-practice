package module_13_array.questions;

public class J_10_ReverseArray {
    // Write a program to reverse the array without using extra array
    public static void swap(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};

        System.out.println("Array Before : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n#Reverse Array : Two Pointer Approach");
        int n = arr.length;
        int i = 0, j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println("Array after reverse : ");
        for (int k : arr) {
            System.out.print(k + " ");
        }
//        System.out.println("\nAfter Reverse : ");
//        swap(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }


    }
}
