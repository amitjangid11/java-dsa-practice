package module_11_methods;

public class J_06_Shadowing {
    static int x = 20; // This will be shadowed at line 6
    public static void main(String[] args) {
        System.out.println(x); //20
        int x = 10;
        System.out.println(x);//10
        fun();
    }
    static void fun(){
        System.out.println(x);//20
    }
}
