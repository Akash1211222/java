package recursion;

public class print {
    public static void fun(int i) {
        if(i>10) return;
        System.out.print(i + " ");
        fun(i + 1);
    }
    public static void main(String[] args) {
        fun(0);
    }
}
