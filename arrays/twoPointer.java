package arrays;

import java.util.Scanner;

public class twoPointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++) {
                arr[i]= sc.nextInt();
            }
            int target = sc.nextInt();
            int i =0;
            int j = n-1;

            while(i<j){
                int sum  = arr[i] + arr[j];
                if(sum == target){
                    System.out.println(arr[i]+" "+arr[j]);
                    break;
                }
                else if(sum >target){
                    j--;
                }
                else{
                    i++;
                }
            }

        }
    }
