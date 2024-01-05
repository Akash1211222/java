package Searching;

import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        ;
        int ans = -1;
        int mid = arr.length / 2;
        
        if (arr[mid] == key) {
            ans = mid;          
        } else if (arr[mid] < key) {
            
        }
    }
}
