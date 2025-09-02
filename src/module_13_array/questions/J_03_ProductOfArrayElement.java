package module_13_array.questions;

public class J_03_ProductOfArrayElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -55};
        int product = 1;
        // Product of array using loop
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }

        // Total sum
        System.out.println("Product of arrays : " + product);
    }
}