package string;
public class lexcography {
    public static void main(String[] args) {
        // for a given set of str print the largest str?
        String str[] = { "mango", "apple", "orange", "banana" };
        
        String largest = str[0];

        for (int i = 1; i < str.length;i++){   //time comp = O(x*n)
            if(largest.compareToIgnoreCase(str[i]) <0){
                largest = str[i];
            }
        }
        System.out.println(largest);
    }
}
