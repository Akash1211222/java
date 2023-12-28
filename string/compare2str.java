package string;

import java.util.Scanner;

public class compare2str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        if (a.compareTo(b) > 0) {
            System.out.println("a is greater");
        } else if (a.compareTo(b) < 0) {
            System.out.println("b is greater");
        } else {
            System.out.println("both are equal");
        }
    }
}
