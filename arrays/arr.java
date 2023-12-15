package arrays;

public class arr {
    public static void main(String[] args) {
    int n =5;
    int[] arr = new int[n];
    arr[0] = 10;
    arr[1]= 10;
    arr[2] = 10;
    arr[3] = 10;
    arr[4] = 10;
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += arr[i];
    }
    System.out.println(sum);

    }
}
