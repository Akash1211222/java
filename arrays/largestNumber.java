import java.util.*;

public class largestNumber {
    public static int largest(int[] num) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] num = { 2, 4, 6, 9, 4, 22, 77, 14, 224, 1 };
        System.out.println("the largest num is :- " + largest(num));
    }
}
