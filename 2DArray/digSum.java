import java.util.*;
public class digSum {
    // Digonal sum
        // 1 5 3 5 8
        // 7 6 5 9 3
        // 2 6 5 8 2`
        // 1 3 5 8 3
        // 9 6 4 6 2
        //  Ans = 22 34 
       
        public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int sumP = 0;
            int sumS = 0;

            for (int i = 0; i < n; i++) {
                sumP += arr[i][i];
            }
            for (int i = 0; i < n; i++) {
                sumS += arr[i][n - 1 - i];
            }

            System.out.println(sumP + " " + sumS + " ");

            sc.close();
        




    }
}
