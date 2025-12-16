package module_16_stringBuilder.lecture;

public class J_04_StringBuilderFunction {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Amit Jangid");
        StringBuilder sb2 = new StringBuilder("Golu Jangid");

        System.out.println(sb1.compareTo(sb2));
        System.out.println(sb1.indexOf("i"));

        System.out.println(sb1.reverse());


    }
}
