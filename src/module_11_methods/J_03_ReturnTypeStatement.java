package module_11_methods;

public class J_03_ReturnTypeStatement {
    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);
    }
    // String type
    static String greet(){
        String show = "Hello, how are you??";
        return show;
    }
}
