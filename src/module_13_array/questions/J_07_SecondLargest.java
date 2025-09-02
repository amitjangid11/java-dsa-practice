package module_13_array.questions;

public class J_07_SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,34,5,7,8,9,56};
        int size = arr.length;

        int max= Integer.MIN_VALUE;
        for (int i = 0;i<size;i++){
            max = Math.max(arr[i] , max);
        }

        int s_max = Integer.MIN_VALUE;
        for (int i = 0;i < size; i++){
            if(arr[i] > s_max && arr[i] != max){
                s_max = arr[i];
            }
        }
        // Output
        System.out.println("Maximum Element in array is : " + s_max);
    }
}




