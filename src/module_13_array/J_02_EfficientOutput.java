package module_13_array;

public class J_02_EfficientOutput {
    public static void main(String[] args) {
        int[] arr = new int[5];
        // Initialization of individual elements
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // Printing output using "loop" efficient way
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
