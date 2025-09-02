package module_09_conditional_statement;

public class J_07_LogicalOperators {
    public static void main(String[] args) {
        // && (AND) Operator
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        if ((num > 99) && (num < 1000)) {
            System.out.println(num + " is Three digit number.");
        } else {
            System.out.println(num + " is not a Three digit number.");
        }
         */
        // OR(||) Operator
        int x = 10;

        if ((x > 10) || x <= 10) {
            System.out.println("Condtion True");
        } else {
            System.out.println("Condtion False");
        }

    }
}
