package string;

import java.util.Scanner;
// using 2 pointers

public class swapstr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // hello
// swap=> w[1] to p[3]
StringBuilder sb = new StringBuilder(s);
int i = 0;
int j = sb.length() - 1;

while (i < j) {

    char w = sb.charAt(i);
    char p = sb.charAt(j);

    sb.setCharAt(i, p);
    sb.setCharAt(j, w);

    i++;
    j--;
}
System.out.println(sb);
    }
}
