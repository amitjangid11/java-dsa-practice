package module_13_array;

import java.util.Arrays;

public class J_07_ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {12,34,5,5,6,7,};
        Arrays.sort(arr);
        // For each Loop : Use when we have to print value stored in DS
        for(int i : arr){ // For int i in array
            System.out.print(i + " ");
        }
    }
}
