package practice;

import java.util.Scanner;

public class rev {
    public static void reverse(int[] arr) {
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9 };
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
