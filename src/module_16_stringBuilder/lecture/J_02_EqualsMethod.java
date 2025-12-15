package module_16_stringBuilder.lecture;

public class J_02_EqualsMethod {
    public static void main(String[] args) {
        String str1 = "abcxyz";
        String str2 = "abcxyz";
        String str3 = new String(str1);
        String str4 = "abc";
        str4 += "xyz";

//         '==' it technically compares the addresses
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

//        equals() compares the actual string
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
    }
}
