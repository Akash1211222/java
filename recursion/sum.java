package recursion;

public class sum {
    public static int add(int i, int x) {
        if (i <= x)
            return x;
        return i + add(i+1, x*i);
    }
    public static void main(String[] args) {
        int i = 0;
        int add = add(i,5);
        System.out.println(add);
    }
}
