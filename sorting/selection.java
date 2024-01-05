package sorting;

public class selection {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int tem = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = tem;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        selectionSort(arr);
    }
}
