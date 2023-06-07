import java.util.*;

public class smallestNum {
    public static int smallest(int[] num) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < smallest) {
                smallest = num[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] num = { 2, 4, 6, 9, 4, 22, 77, 14, 224, 1 };
        System.out.println("The smallest num is :-" + smallest(num));
    }
}
