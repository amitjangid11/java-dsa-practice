package module_13_array.questions;

public class J_05_MaximumElement {
    public static void main(String[] args) {
        int[] arr = {-10, -2, -30, -42, -25, -34, -234, -42};
        int n = arr.length;

        // Method-1
        /*
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
         */
        // Method-2
        // Problem with this method : If elements of array is less than -1 , than max will never get updated, max value will always be -1 that is not even the part of array that's why we use ( Integer.MIN_VALUE)
//        int max = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
//            if (arr[i] > max){
//                max = arr[i];
//            }
            // Java-method
            max = Math.max(max, arr[i]);
        }

        // Output
        System.out.println("Maximum Element in array is : " + max);
    }
}
