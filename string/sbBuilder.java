package string;

public class sbBuilder {
    public static void main(String[] args) {
        String s = "HELLO JI";
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.charAt(2));
        System.out.println(sb.insert(3, "E"));
        System.out.println(sb.delete(3, 5));
        sb.setCharAt(0, 'E');
        System.out.println(sb);
    }
}
