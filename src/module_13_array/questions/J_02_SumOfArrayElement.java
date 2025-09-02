package module_13_array.questions;

public class J_02_SumOfArrayElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,-55};
        int sum = 0;
        // Sum of array using loop
        for (int i = 0; i < arr.length;i++){
            sum += arr[i];
        }

        // Total sum
        System.out.println("Sum of arrays : " + sum);
    }
}
