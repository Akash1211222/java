import java.util.*;

public class subArr {
    public static void printSub(int num[]) {
        for (int i = 0; i < num.length; i++) {
            // int start = i;
            for (int j = i; j < num.length; j++) {
                // int end = j;
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };
        printSub(num);

    }
}
