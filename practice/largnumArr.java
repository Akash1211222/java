package practice;

import java.util.Scanner;

public class largnumArr {
    public static int largest(int[] arr) {
        int larg = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > larg) {
                larg = arr[i];
            }
            
        }

        return larg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2, 3, 4, 5, 6, 7, 89,10,44,2 };
        System.out.println(largest(arr));
    }
}
