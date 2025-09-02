package module_11_methods;

import java.util.Arrays;

public class J_07_VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 6, 7, 8, 9);
        greet("hey", "how are you?", "all good");
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void greet(String... s) {
        System.out.println(Arrays.toString(s));
    }
}
