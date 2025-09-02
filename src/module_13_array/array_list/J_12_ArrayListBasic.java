package module_13_array.array_list;

import java.util.ArrayList;

public class J_12_ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(); // Empty array list

        System.out.println(list + " " + list.size()); // size() - let us see the size of arraylist
        list.add(10); // Push Back : in empty list means at index 0
        System.out.println(list + " " + list.size());
        list.add(20);
        System.out.println(list + " " + list.size());
        list.add(30);
        System.out.println(list + " " + list.size());
        list.add(40);
        System.out.println(list + " " + list.size());

        list.remove(1); // removing element at index 1
        System.out.println(list + " " + list.size());

    }
}

/*
Points to Rememeber :
1. In Java, arrays they have fixed size. So, we use dynamic arrays(arrayList) using oops.
2. Size of the array just doubled when eixsting size got fulled.
 */
