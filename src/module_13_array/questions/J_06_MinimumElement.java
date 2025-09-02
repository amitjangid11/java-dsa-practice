package module_13_array.questions;

public class J_06_MinimumElement {
    public static void main(String[] args) {
        int[] arr = {-10, -2, -30, -42, -25, -34, -234, -42};
        int n = arr.length;

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
//            min = Math.min(min, arr[i]);
        }

        // Output
        System.out.println("Maximum Element in array is : " + min);
    }
}

