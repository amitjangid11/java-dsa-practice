package module_13_array.questions;
// Leetcode : 1.
// Find the doublet int the array whose sum is equal to the given value x.(Two Sum)
public class J_09_SumPair {
    public static void main(String[] args) {
        int target = 10;
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int count = 1;

        // Solution to the Question
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair " + count + ": (" + arr[i] + " ," + arr[j] + " )");
                    count++;
                    break;
                }
            }
        }
    }
}
