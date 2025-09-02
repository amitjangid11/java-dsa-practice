package module_11_methods;

import java.util.Arrays;
public class J_05_SwapFunction {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        System.out.println("Before Swap : " + num1 + " " + num2);
        // Not swapping : In java there is no concept like pass by reference
        /*
        Note : Its actually a concept of object and reference variable
        2) And for primitive datatype only pass by value is possible
        3) Non-primitive datatype like array,string ,etc
        4) If you make a change to the object via ref variable it will change the value

         */
         swap(num1, num2);
        System.out.println("After Swap : " + num1 + " " + num2);

        //Non-primitive datatype
        int[] arr = {1,2,3,4,5};
        System.out.println("Before : " + Arrays.toString(arr));
        change(arr); // This will change the arr[0] bcoz arr and nums is referencing to same object
        System.out.println("After : " + Arrays.toString(arr));

    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

    }
    static void change(int[] nums){
        nums[0] = 10;
    }

}
