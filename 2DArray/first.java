
import java.util.*;

public class first {
    public static boolean search(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[j][i] == key) {
                    System.out.println("Found at index" + i + "," + j);
                    return true;
                }
            }

        }
        System.out.println("Key not found");
        return false;
    }
    
    public static void largest(int arr[][]) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (a < arr[i][j]) {
                    a = arr[i][j];
                }
            }
        }
        System.out.println(a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];

        int n=arr.length,m=arr[0].length;

        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // output array

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // search(arr, 9);
        largest(arr);

    }
}
