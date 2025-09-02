package module_13_array.questions;
// Q. Second largest when all the elements of array is same what would you do in that case when max and s_max is same?
public class J_08_SecondLargestSameElement {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) return -1; // If array has less than 2 elements, return -1

        int max = arr[0];  // Assume first element is max
        Integer s_max = null; // Use Integer object to handle null cases

        for (int i = 1; i < arr.length; i++) { // Start loop from second element
            if (arr[i] > max) {
                s_max = max;
                max = arr[i];
            } else if (arr[i] < max) { // Ensure distinct value for s_max
                if (s_max == null || arr[i] > s_max) {
                    s_max = arr[i];
                }
            }
        }

        return (s_max == null) ? -1 : s_max;
    }

    public static void main(String[] args) {
        int[] arr = {5, 5, 5, 5, 5}; // All elements are the same
        int secondLargest = findSecondLargest(arr);

        if (secondLargest == -1) {
            System.out.println("No second largest element exists.");
        } else {
            System.out.println("Second largest element: " + secondLargest);
        }
    }
}
