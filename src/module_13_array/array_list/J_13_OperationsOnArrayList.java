/*
 * Problem: Operations on ArrayList
 *
 * Purpose:
 *   - Learn the most common ArrayList methods with examples.
 *   - Understand how ArrayList grows dynamically compared to arrays.
 *
 * Covered Methods:
 *   1. add(index, value) → insert at index
 *   2. add(value) → insert at end
 *   3. get(index) → access element
 *   4. set(index, value) → update element
 *   5. size() → number of elements
 *   6. remove(index) → delete element
 *   7. contains(value) → check if element exists
 *   8. clear() → remove all elements
 */

package module_13_array.array_list;

import java.util.ArrayList;

public class J_13_OperationsOnArrayList {
    public static void main(String[] args) {
        // Create ArrayList with initial capacity = 6 (not size!)
        ArrayList<Integer> arr = new ArrayList<>(6);

        // --------------------------------------------------
        // Adding elements (index-based)
        // --------------------------------------------------
        arr.add(0, 10);
        arr.add(1, 20);
        arr.add(2, 30);
        arr.add(3, 40);
        arr.add(4, 50);
        arr.add(5, 60);

        // Print ArrayList (Method 1: using loop)
        System.out.print("Using loop: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " "); // similar to arr[i]
        }
        System.out.println();

        // Print ArrayList (Method 2: directly)
        System.out.println("Direct print: " + arr);

        // --------------------------------------------------
        // Modifying element
        // --------------------------------------------------
        arr.set(0, 100); // change index 0 → 100
        System.out.println("After modification: " + arr);

        // --------------------------------------------------
        // Adding new element at end
        // --------------------------------------------------
        arr.add(70);
        System.out.println("After adding 70: " + arr);

        // --------------------------------------------------
        // Removing element
        // --------------------------------------------------
        arr.remove(2); // remove element at index 2
        System.out.println("After removing index 2: " + arr);

        // --------------------------------------------------
        // Searching element
        // --------------------------------------------------
        boolean exists = arr.contains(50);
        System.out.println("Does 50 exist? " + exists);

        // --------------------------------------------------
        // Clearing entire ArrayList
        // --------------------------------------------------
        arr.clear();
        System.out.println("After clear(): " + arr + " | size = " + arr.size());
    }
}

/*
 * Quick Notes for Revision:
 *  - ArrayList methods:
 *      add(value) / add(index, value) → insert
 *      get(index) → fetch
 *      set(index, value) → update
 *      size() → number of elements
 *      remove(index) → delete by index
 *      contains(value) → check presence
 *      clear() → empty ArrayList
 *
 * Differences from Arrays:
 *  - No default values like arrays → starts empty.
 *  - Automatically resizes (capacity doubles internally).
 *  - Stores objects (primitives → wrapper classes).
 *
 * Interview Hint:
 *  - ArrayList is backed by an array internally.
 *  - Access time (get/set) → O(1).
 *  - Insert/remove at end → O(1) amortized.
 *  - Insert/remove at middle → O(n) (shifting elements).
 */
