import java.util.Scanner;

public class reverse {
    public static void reverse(int num[]) {
        int start = 0;
        int last = num.length - 1;
        while (start < last) {
            // swap
            int temp = num[last];
            num[last] = num[start];
            num[start] = temp;

            start++; // as the start btn is going in +1 spo it is in the format of the arr[]
            last--; // as the start btn is going in -1 spo it the format of the arr[] is in refill.
        }
    }

    public static void print(int arr[]) {
        // swap with the +1 value and the format of +2
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // To print the value of an arr[]
        }
        System.out.println(); // To go to the next line as the value of arr[]
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int n = sc.nextInt();
        System.out.println("enter the value");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your value is:");
        print(arr);
        reverse(arr);
        System.out.println("Your reversed value is:");
        print(arr);
    }

}
