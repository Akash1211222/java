package arrays;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        // Multiplaction of the array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
         int mul = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            mul *= arr[i];
        }
        System.out.println(mul);

        sc.close();

    }
}
