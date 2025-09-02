package module_13_array.array_list;

import java.util.ArrayList;

public class J_13_OperationsOnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6); // 6 : is initial capacity of the array not the size

        arr.add(0, 10);  // Initialization of arrayList
        arr.add(1, 20);
        arr.add(2, 30);
        arr.add(3, 40);
        arr.add(4, 50);
        arr.add(5, 60);

        // To print arraylist - Type:1
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " "); // arr[i]
        }
        System.out.println();

        // Printing arrayList - Type:2
        System.out.println(arr);

        // Modification of element
        arr.set(0, 100);
        for (int i = 0;i < arr.size();i++){
            System.out.print(arr.get(i) + " ");
        }

        arr.add(70); // Push Back (c++)

        System.out.println();
        System.out.println(arr.size()); // 7
//        for (int i = 0;i<arr.size();i++){
//            System.out.print(arr.get(i) + " ");
//        }
        System.out.println(arr);
    }
}
/*
Note :
1) There is no defaullt value assigned to arrayList like c++.
2) But '0' is assigned as default value to array.

# MEthods used :
1. add(index,value) : to add values to ArrayList at index
2. get() : To get the value for printing
3. set() : To modify existing value
4. size() : returns the size of ArrayList
 */
