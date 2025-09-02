package module_13_array;

import java.util.Arrays;

public class J_06_BuiltInMethods {
    public static void main(String[] args) {
        int[] arr = {30, 10, 40, 23, 89, 34};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr); // Built in methods to sort arrays
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

