package practice;
import java.util.*;

public class linear {
    public static int searchLin(int[] num, int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
        int key = sc.nextInt();

        int index = searchLin(num, key);
        if (index == -1) {
            System.out.println("Key is not found");
        } else {
            System.out.println("index found at :- " + index);
        }
        // System.out.println(searchLin(num, key));
        sc.close();
    }
}
