package module_12_pattern_printing;

public class J_01_SymbolPattern {
    public static void main(String[] args) {
//        rectanglePattern(4);
//        squarePattern(4);
//        starRightTriPattern(4);
//        reverseStarRightTriPattern(4);

    }

    // Reverse starRightTriPattern
    static void reverseStarRightTriPattern(int n) {
        System.out.println("4. Reverse Star Right Triangle");
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // starRightTriPattern
    static void starRightTriPattern(int n) {
        System.out.println("3. Star Right Triangle");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // square
    static void squarePattern(int n) {
        System.out.println("\n2. Square Pattern");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // rectangle
    static void rectanglePattern(int n) {
        System.out.println("1. Rectangle Pattern");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
        }
    }
}