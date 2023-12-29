package string;

import java.util.Scanner;

public class paland {
    public static boolean palanddrom(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "madam";
        System.out.println(palanddrom(str));
        // StringBuilder sb = new StringBuilder(s);
        // StringBuilder sb1 = new StringBuilder(s);

        // int i = 0;
        // int j = sb.length() - 1;

        // while (i < j) {

        //     char a = sb.charAt(i);
        //     char b = sb.charAt(j);

        //     sb.setCharAt(i, b);
        //     sb.setCharAt(j, a);
        //     i++;
        //     j--;
            
        // }
        // System.out.println(sb);
        // System.out.println(sb1);
        
        // if (sb.compareTo(sb1) == 0) {
        //     System.out.println("yes palandrome");
        // } else {
        //     System.out.println("NO palandrome");
        // }

    }
}
