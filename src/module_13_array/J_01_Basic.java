package module_13_array;
//Note : In default value stored in array is 0 or zero.
public class J_01_Basic {
    public static void main(String[] args) {

        // Defination or declaration or memoery allocation of Array
        int[] arr = new int[5];
        // Initialization of individual elements
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // Printing values
        System.out.println("Before Updation -");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //Updation individual Element
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        arr[4] = 500;

        // Again Printing Updated values
        System.out.println("After Updation -");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

    }
}