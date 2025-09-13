package module_12_pattern_printing;

public class J_07_String_Pattern {
    public static void main(String[] args) {
        alphabetRectangle(5);
    }

    static void alphabetRectangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
//                char ch = (char) (i + 65);
                char ch = (char) (i + 65);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
