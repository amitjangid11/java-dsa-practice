package module_16_stringBuilder.lecture;

public class J_03_StringBuilder {
    public static void main(String[] args) {
        String s = new String("abc");

        StringBuilder sb3 = new StringBuilder(s);
        StringBuilder sb1 = new StringBuilder("abc");
        StringBuilder sb2 = new StringBuilder(10);

        System.out.println("sb1 :" + sb1);
        System.out.println(sb1.length());

        System.out.println("sb2 :" + sb2);
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        System.out.println("sb3 :"+sb3);
        System.out.println(sb3.length());
        System.out.println(sb3.capacity()); // 19 why ? bcoz by default 16 is capacity
    }
}
