package string;

import java.util.Scanner;

public class uppercase {
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder(""); // creating a stringBuilder 
        char ch = Character.toUpperCase(str.charAt(0)); // making 1 str ch to Uppercase
        sb.append(ch);  // adding in sb.toString()

        for (int i = 1; i < str.length(); i++) {    //looping through characters
            if (str.charAt(i) == ' ' && i < str.length() - 1) {     //if i= space or the last ch
                sb.append(str.charAt(i));   // adding in sb.toString() space
                i++;    // increasing by 1
                sb.append(Character.toUpperCase(str.charAt(i)));    // making uChase
            } else {
                sb.append(str.charAt(i)); // adding in sb.toString()
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        // for a given string convert each the first letter word to uppercase?
        // EXAMPLE: "hi, i am akash paul" => "Hi, I Am Akash Paul"
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(toUpperCase(str));
    }
}
