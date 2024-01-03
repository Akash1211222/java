package BufferReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class input {
    public static void main(String[] args)  throws Exception {
        // Buffer reader
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        // String s = br.readLine();
        // int x = Integer.parseInt(br.readLine());
        // float y = Integer.flo(br.readLine());
        // System.out.println(s);
        int arr[] = new int[5];
        String s = br.readLine();
        String[] sty = s.split(" ");
        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(sty[i]);
        }
        for (int i = 0; i < 5; i++) {
           System.out.println(arr[i]+" ");
        }
        System.out.println(sty);                          
        
    
    }
}
