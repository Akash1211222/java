package string;

import java.util.Scanner;

public class sw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int n = s.length();
        boolean ok = true;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                ok = false;
                break;
            }
        }
        if (ok == true){
            System.out.println("Yes");
        }
            else{
                System.out.println("No");
            }
        }

    }