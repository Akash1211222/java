import java.util.*;

public class subArr {
    public static void printSub(int num[]) {
        int ts = 0;
        for (int i = 0; i < num.length; i++) {
            // int start = i;
            for (int j = i; j < num.length; j++) {
                // int end = j;
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                    int total = num[i] + num[j];
                    System.out.println(total);
                }

                System.out.println();
                ts++;
            }
        }
        System.out.println("total sub arrays " + ts);

    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 9 };
        printSub(num);

    }
}
