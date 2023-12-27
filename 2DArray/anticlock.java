import java.util.Scanner;

public class anticlock {
    public static void antiClockwise(int arr[][]){
        int startRow =0;
        int startCol =0;
        int endRow = arr.length -1;
        int endCol = arr[0].length -1;

        while(startRow <= endRow && startCol <= endCol){
            // left
            for(int i=startRow; i<= endRow;i++){
                System.out.print(arr[i][startRow]+" ");
            }
            // bottom
            for(int j=startCol+1; j<= endCol; j++){
                System.out.print(arr[endRow][j]+" ");
            }
            // right
            for(int i =endRow-1; i>=startRow; i--){
                System.out.print(arr[i][endRow]+" ");
            }
            // top
            for(int j = endCol-1; j>=startCol+1; j--){
                System.out.print(arr[startCol][j]+" ");
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];
        // input
        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        antiClockwise(matrix);
    }
    }

2