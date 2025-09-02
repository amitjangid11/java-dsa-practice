package module_11_methods;

public class Further_In_Methods_02 {
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    // To call non-static method
    int substract(int a, int b) {
        int c;
        if (a > b) {
            c = a - b;
        } else {
            c = b - a;
        }
        return c;
    }


    public static void main(String[] args) {
        int a = 5, b = 3;
        int c = logic(a, b); // Calling a method : Type-1
        System.out.println(c);

        int a1 = 5, b1 = 3;
        int c1 = logic(a1, b1); // calling a method : Type-1
        System.out.println(c1);
// Method invocaiton using Object creation
        Further_In_Methods_02 obj = new Further_In_Methods_02();
        c = obj.substract(a, b);

    }
}
