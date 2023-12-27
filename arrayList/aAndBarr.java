package arrayList;
import java.util.*;
import java.util.Scanner;


public class aAndBarr {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 1;
            for(int i=0;i<n;i++){
                int x = sc.nextInt();
                A.add(x);
                m*=x;

            }
            ArrayList<Integer> B = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                int x = m / A.get(i);
                B.add(x);
            }
            System.out.println(A);
            System.out.println(B);
    }
}
