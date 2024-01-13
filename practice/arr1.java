package practice;

public class arr1 {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        // int[] marks = new int[50];
        // int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        // String[] fruits = { "apple", "orange", "banana", "mango" };

        // taking inputs
        // int marks[] = new int[10];
        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("phy:- "+ marks[0]);
        // System.out.println("chem:- "+ marks[1]);
        // System.out.println("math:- " + marks[2]);
        // length
        // System.out.println(marks.length);

        int marks[] = { 97, 98, 99 };
        update(marks);
        // call by refrence

        // print
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

    }
}
