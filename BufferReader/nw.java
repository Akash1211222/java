package BufferReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class nw {
    public static void main(String[] args) throws Exception {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        String s = br.readLine();
        System.out.println(s);

        int n = Integer.parseInt(br.readLine());
        System.out.println(n);

        int arr[] = new int[n];
        String str = br.readLine();
        String[] a = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(a[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }
}
