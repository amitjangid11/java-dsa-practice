package module_12_pattern_printing;

public class J_01_SymbolPattern {
    public static void main(String[] args) {
//        rectanglePattern(4);
//        squarePattern(4);
//       starRightTriPattern(4);
//        reverseStarRightTriPattern(4);
//        rightSideStartingTriPattern(5);;
//        reverseRightSideStartingTriPattern(5);
        midTriPattern(5);
    }

    // midTriPattern-1
    public static void midTriPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // midTriPattern-2
    public static void midTrianglePattern(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n - i) + "* ".repeat(i));
        }
    }

    // midTriPattern-3
    public static void midTriPatternCompact(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(" ".repeat(n - i));
            System.out.println("*".repeat(2 * i - 1));
        }
    }

    //midTriPattern-4
    public static void midTriPatternOneLoop(int n) {
        int totalCols = 2 * n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < totalCols; j++) {
                if (j >= n - 1 - i && j <= n - 1 + i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }


    // reversLeftSideStartingTriPattern
    public static void reverseRightSideStartingTriPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //    rightSideStartingTriPattern
    public static void rightSideStartingTriPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
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