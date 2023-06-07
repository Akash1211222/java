import java.util.Scanner;

public class binarySearch {
    public static int binarySearch(int num[], int key) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (num[mid] == key) {
                return mid;
            } else if (num[mid] < key) {
                start = mid + 1;
            } else if (num[mid] > key) {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int n = sc.nextInt();
        System.out.println("enter the value");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter key");
        int key = sc.nextInt();
        int ans = binarySearch(arr, key);
        if (ans == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("base is :- " + ans);
        }

        System.out.println(binarySearch(arr, 10));
        System.out.println(binarySearch(arr, 1));
        System.out.println(binarySearch(arr, 2));
        System.out.println(binarySearch(arr, 3));
        System.out.println(binarySearch(arr, 4));
        System.out.println(binarySearch(arr, 5));
        System.out.println(binarySearch(arr, 6));

    }
}
