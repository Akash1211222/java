package string;

import java.util.Scanner;

public class inOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input
        String s = sc.nextLine();
        // outputr
        System.out.println(s);
        // length
        int sLen = s.length();
        System.out.println(sLen);
        // forloop 
        // for (int i = 0; i < sLen; i++) {
        //     if (s.charAt(i) == ' ') {
                
        //     }
        for (int i = sLen-1; i > 0; i--) {
           System.out.println(s.charAt(i));
                
            }
        }
    }
