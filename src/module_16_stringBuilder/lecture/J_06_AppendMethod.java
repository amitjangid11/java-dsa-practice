package module_16_stringBuilder.lecture;

public class J_06_AppendMethod {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        System.out.println(sb);
        sb.append("xyz");
        System.out.println(sb);
        sb.append(69);
        System.out.println(sb);
        sb.append('A');
        System.out.println(sb);

        char[] ch = {'q','w','e','r','t','y'};
        sb.append(ch);
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder("keyboard");
        sb.append(sb2);
        System.out.println(sb);

        // Doesn't work
//        int[] arr = {1,2,3,4,5};
//        sb.append(arr);
//        System.out.println(sb);

//        s += "false"; not possible
    }
}
