package string;

import java.util.Scanner;

public class concat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "akash";
        String b = "Paul";
        String c = a + " " + b;
        System.out.println(c);
        String d = a.concat(b);
        System.out.println(d);
    }
}
