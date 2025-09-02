package module_13_array;

import java.util.Arrays;

public class J_08_CopyOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        for (int i : arr) {
            System.out.print(i + " ");
        }

        //int[] a = arr; // Shallow copy
        //a[0] = 10; // Changing in a[0] will also change in arr[0] that's why it is called shallow copy
        // System.out.println(arr[0]); // output : 10

        // Solution of shallow copy
        int[] brr =  Arrays.copyOf(arr, arr.length); // Deep copy is created
        brr[0] = 10;
        System.out.println("\n" + arr[0]); // output : 1

    }
}
/*
Note :-
1. When we just direct copy array to another array, it just the same array with different name on it, any changes in 2nd array will impact the 1st array as well.
2.
 */
