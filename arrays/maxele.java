package arrays;

import java.util.Scanner;

public class maxele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        int max2 = 0;
        int max3 = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max3 = max2;
                max2 = max;
                max = arr[i];
            }
            
        }
        System.out.println("max ele of arr is = "+max + " max2 = "+max2 + " max3 = "+max3);



    }
}
