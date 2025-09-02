package module_13_array;

public class J_05_PassingArrayToMethods {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(arr[0]); // 1
        change(arr); // Pass By Reference : In Java Reference variable gets passed.
        System.out.println(arr[0]); // 10 -> changed
    }

    public static void change(int[] brr) {
        brr[0] = 10; // arr and brr are the name of same array
    }
}
