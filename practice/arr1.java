package practice;

public class arr1 {
    public static void main(String[] args) {

        int arr[] = {2,3,4,5,6,100,0,101,1};
        int maxEven = Integer.MIN_VALUE;
        int minOdd = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                maxEven = i;
            } else {
                minOdd = i;
            }
        }
        int result = maxEven - minOdd;

        System.out.println(result);
    }
}
