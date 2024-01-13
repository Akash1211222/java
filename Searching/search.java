package Searching;
import java.util.*;

public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int ans = -1;
        for (int i = 0; i < n; i++){
            if(arr[i] == x){
                ans = i;
                break;
            }
        }
        if(ans != -1){
            System.out.println(x + " " + ans);
        }else{
            System.out.println(x + "is not present");
        }
    }
}
