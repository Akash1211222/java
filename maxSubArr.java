import java.util.*;

public class maxSubArr {
    public static void maxSumSubArr(int[] num) {
        int current = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                current = 0;
                for (int k = i; k <= j; k++) {
                    current += num[k];
                }
                System.out.println(current);
                if (current > maxSum) {
                    maxSum = current;
                }
            }
        }
        System.out.println("the max sum of Sub arr is:= " + maxSum);
    }

    public static void main(String[] args) {
        int[] num = { 2, 4, 6, 8, 10 };
        maxSumSubArr(num);
    }
}
