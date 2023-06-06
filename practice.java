import java.util.*;

public class practice {
    public static int largestNo(int num[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i];
            }
        }
        return largest;
    }

    public static int smallestNo(int num[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < smallest) {
                smallest = num[i];
            }
        }
        return smallest;
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // taking input
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // printing the largest and smallest
        int largest = largestNo(arr);
        int smallest = smallestNo(arr);
        System.out.println("Largest Number: " + largest);
        System.out.println("Smallest Number: " + smallest);

    }
}