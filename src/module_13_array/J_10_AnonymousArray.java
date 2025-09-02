package module_13_array;
// Java supports the feature of an anonymous array, so we do not need to declare the array while passing an array to the method.
public class J_10_AnonymousArray {
    //creating a method which receives an array as a parameter
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        printArray(new int[]{10, 22, 44, 66});//passing anonymous array to method

    }
}
