package module_13_array.array_1d;

import java.util.Arrays;

public class J_06_Built_In_MethodsExtra {
    public static void main(String[] args) {
        int[] arr = {30, 10, 40, 23, 89, 34};

        // --------------------------------------------------
        // 1. Arrays.toString()
        // --------------------------------------------------
        System.out.println("Original Array: " + Arrays.toString(arr));

        // --------------------------------------------------
        // 2. Arrays.sort()
        // --------------------------------------------------
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // --------------------------------------------------
        // 3. Arrays.fill()
        // --------------------------------------------------
        int[] fillArr = new int[5];
        Arrays.fill(fillArr, 7); // fill with value 7
        System.out.println("Array after fill: " + Arrays.toString(fillArr));

        // --------------------------------------------------
        // 4. Arrays.equals()
        // --------------------------------------------------
        int[] arr2 = {10, 23, 30, 34, 40, 89};
        System.out.println("Arrays equal? " + Arrays.equals(arr, arr2));

        // --------------------------------------------------
        // 5. Arrays.copyOf()
        // --------------------------------------------------
        int[] copyArr = Arrays.copyOf(arr, arr.length); // copy arr into new array
        System.out.println("Copied Array: " + Arrays.toString(copyArr));

        // --------------------------------------------------
        // 6. Arrays.binarySearch()
        // --------------------------------------------------
        int index = Arrays.binarySearch(arr, 34); // works only on sorted array
        System.out.println("Index of 34 in sorted array: " + index);
    }
}
/*
 * Quick Notes for Revision:
 *  - Arrays.toString(arr) → convert array to string format.
 *  - Arrays.sort(arr) → sorts ascending.
 *  - Arrays.fill(arr, value) → fills with given value.
 *  - Arrays.equals(arr1, arr2) → checks if two arrays are equal.
 *  - Arrays.copyOf(arr, newLength) → copies to new array.
 *  - Arrays.binarySearch(arr, key) → returns index of key (sorted array only).
 */