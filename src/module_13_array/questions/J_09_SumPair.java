/*
 * Problem: Find Pairs with Given Sum (LeetCode #1 - Two Sum)
 *
 * Purpose:
 *   - Practice array traversal and nested loops.
 *   - Learn brute-force approach and optimized HashSet approach.
 *
 * Example:
 *   Input: arr = {1, 2, 3, 4, 5, 6, 7}, target = 10
 *   Output: (3, 7), (4, 6)
 */

package module_13_array.questions;

import java.util.HashSet;

public class J_09_SumPair {
    public static void main(String[] args) {
        int target = 10;
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        // --------------------------------------------------
        // Method 1: Brute Force (O(n^2))
        // --------------------------------------------------
        int count = 1;
        System.out.println("Brute Force Approach:");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair " + count + ": (" + arr[i] + ", " + arr[j] + ")");
                    count++;
                    break; // avoid duplicate pairs with same i
                }
            }
        }

        // --------------------------------------------------
        // Method 2: Optimized using HashSet (O(n))
        // --------------------------------------------------
        System.out.println("\nOptimized Approach (HashSet):");
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            int complement = target - num;
            if (set.contains(complement)) {
                System.out.println("Pair: (" + complement + ", " + num + ")");
            }
            set.add(num);
        }
    }
}

/*
 * Quick Notes for Revision:
 *  - Brute Force → check all pairs → O(n^2).
 *  - Optimized → use HashSet → O(n) time, O(n) space.
 *  - HashSet ensures fast lookup of complement.
 *  - LeetCode "Two Sum" variation → usually requires returning indexes, not just pairs.
 */
