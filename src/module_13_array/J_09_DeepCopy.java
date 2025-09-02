package module_13_array;

public class J_09_DeepCopy {
    public static void main(String[] args) {

        // Another way to create deep copy without using Array in built method
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] brr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
        }
        arr[0] = 10;
        System.out.println(brr[0]);
//        for (int i : brr) {
//            System.out.print(i + " ");
//        }
    }
}
