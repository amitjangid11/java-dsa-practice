package module_12_pattern_printing;

public class J_01_SymbolPattern {
    public static void main(String[] args) {
        rectanglePattern(5);
        squarePattern(5);
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

    static void rhombusPattern(int n){

    }

}