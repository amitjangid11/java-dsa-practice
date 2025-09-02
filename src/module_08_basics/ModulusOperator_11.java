package module_08_basics;

public class ModulusOperator_11 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int remainder = a % b;
        System.out.println("Remainder when dividing " + a + " by " + b + " will give : " + remainder);
        /*
        #Properties
        1) a % b = a if a < b
        2) -a % b = -(a%b)
        3) a % (-b) = a % b
        4) -a % -b = -(a % b)
         */
    }
}
