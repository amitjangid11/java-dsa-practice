/*
 * Problem: Introduction to ArrayList in Java
 *
 * Purpose:
 *   - Learn how ArrayList works (dynamic arrays in Java).
 *   - Understand why ArrayList is preferred over normal arrays.
 *
 * Concept:
 *   - Arrays → fixed size (cannot grow/shrink).
 *   - ArrayList → resizable array (part of java.util package).
 *   - Automatically grows in size when elements are added.
 *
 * Example Operations:
 *   - add(value)   → inserts element at end.
 *   - remove(index) → removes element at given index.
 *   - size()      → returns current number of elements.
 *   - get(index)  → fetch element at index.
 *   - set(index, value) → update element at index.
 */

package module_13_array.array_list;

import java.util.ArrayList;

public class J_12_ArrayListBasic {
    public static void main(String[] args) {
        // Create empty ArrayList of Integers
        ArrayList<Integer> list = new ArrayList<Integer>();

        // --------------------------------------------------
        // Adding elements
        // --------------------------------------------------
        System.out.println("Initially: " + list + " | size = " + list.size());
        list.add(10); // index 0
        list.add(20); // index 1
        list.add(30); // index 2
        list.add(40); // index 3
        System.out.println("After adding elements: " + list + " | size = " + list.size());

        // --------------------------------------------------
        // Removing element
        // --------------------------------------------------
        list.remove(1); // removes element at index 1 (20)
        System.out.println("After removing index 1: " + list + " | size = " + list.size());

        // --------------------------------------------------
        // Accessing & updating elements
        // --------------------------------------------------
        int first = list.get(0); // get element at index 0
        System.out.println("Element at index 0 = " + first);

        list.set(0, 100); // update element at index 0
        System.out.println("After update: " + list);

        // --------------------------------------------------
        // Iterating using for-each loop
        // --------------------------------------------------
        System.out.print("Printing with for-each: ");
        for (int val : list) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

/*
 * Quick Notes for Revision:
 *  - ArrayList → part of java.util, dynamic array implementation.
 *  - Key methods:
 *      • add(value) → insert at end
 *      • add(index, value) → insert at specific index
 *      • remove(index) → remove element
 *      • get(index) → access element
 *      • set(index, value) → update element
 *      • size() → current number of elements
 *  - ArrayList grows automatically (usually doubles capacity).
 *  - Only stores objects (so for primitives like int, use wrapper classes: Integer, Double, etc.).


 * --------------------------------------------------------
 * ✅ Array vs ArrayList (Important Interview Question)
 * --------------------------------------------------------
 * Array:
 *   - Fixed size (cannot grow/shrink once created).
 *   - Can store both primitives (int, char, etc.) and objects.
 *   - Syntax: int[] arr = new int[5];
 *   - Faster access (no overhead).
 *   - No built-in methods for add/remove.
 *
 * ArrayList:
 *   - Dynamic size (grows/shrinks automatically).
 *   - Stores only objects (uses wrapper classes for primitives).
 *   - Syntax: ArrayList<Integer> list = new ArrayList<>();
 *   - Slightly slower (because of dynamic resizing + boxing/unboxing).
 *   - Rich built-in methods: add(), remove(), size(), contains(), etc.
 * --------------------------------------------------------
 */
