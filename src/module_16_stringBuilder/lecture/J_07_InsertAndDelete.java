package module_16_stringBuilder.lecture;

public class J_07_InsertAndDelete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Amit");
        System.out.println(sb);

        // deleteCharAt()
        sb.deleteCharAt(3);
        System.out.println(sb);
        System.out.println(sb.indexOf("i"));

        // append()
        sb.append("t Jangid");
        System.out.println(sb);

        // delete()
        sb.delete(4,11);
        System.out.println(sb);

        // insert()
        sb.insert(2,"it");
        System.out.println(sb);
    }
}
