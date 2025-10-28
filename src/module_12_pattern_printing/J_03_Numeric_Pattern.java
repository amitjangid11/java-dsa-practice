package module_12_pattern_printing;

public class J_03_Numeric_Pattern {
    public static void main(String[] args) {
//        numberSquare(5);
//        numberTriangle(5);
//        numberTriangleFlipped(5);
//        floydsTriangle(5);
//        oddNumberTri2(5);
//        numericPyramidM1(4);
//        numericPyramidM2(4);

        numericBridgePattern(5);
    }

    // numericBridgePattern()
    public static void numericBridgePattern(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 1; i <= n - 1; i++) {
            int a = 1;
            for (int j = 1; j <= n - i ; j++) {
                System.out.print(a++ + " ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("  ");
                a++;
            }

            for (int j = 0; j < n - i; j++) {
                System.out.print((n + i + j) + " ");
            }
//            for (int j = 1; j <= n-i+1 ; j++) {
//                System.out.print(a++ + " ");
//            }
            System.out.println();
        }
    }



    // numericPyramid()
    public static void numericPyramidM1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    // oddTriangle : M-2
    public static void oddNumberTri2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= 2 * i + 1; j += 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // oddTriangle : M-1
    public static void oddNumberTri(int n) {
        for (int i = 0; i < n; i++) {
            int a = 1;
            for (int j = 0; j < i + 1; j++) {
                System.out.print(a + " ");
                a += 2;
            }
            System.out.println();
        }
    }

    // floydsTriangle
    public static void floydsTriangle(int n) {
        int a = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

    // numberTriangleFlipped();
    public static void numberTriangleFlipped(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < i + 1; k++) {
//                System.out.print(k+1+" ");
                System.out.print((char) (k + 65) + " ");
            }
            System.out.println();
        }
    }

    // numberTriangle
    public static void numberTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
//                System.out.print(i+1+" ");
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    // numberSquare
    public static void numberSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
//                System.out.print(i+1 + " ");
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }
}
