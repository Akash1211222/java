package recursion;

public class fact {
    public static int facto(int i) {

        if(i ==0) return 1;
        return i * facto(i - 1);
    }
    public static void main(String[] args) {
        int x = facto(5);
        System.out.println(x);
    }
}
