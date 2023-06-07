public class kadansAlgoArr {
    public static void kadans(int num[]) {
        int max = Integer.MIN_VALUE;
        int current = 0;

        for (int i = 0; i < num.length; i++) {
            current = current + num[i];
            if (current < 0) {
                current = 0;
            }
            max = Math.max(current, max);
        }
        System.out.println("our max sum is= " + max);

    }

    public static void main(String[] args) {
        int[] num = { -2, -3, 4, -1, 2, -1, 5, -3 };
        kadans(num);

    }
}
