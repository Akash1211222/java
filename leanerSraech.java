public class leanerSraech {
    public static int search(int num[], int key) {

        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 2, 6, 88, 99, 102 };
        int key = 102;
        int index = search(num, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found at index: " + index);
        }

    }
}
// time comp= O(n);