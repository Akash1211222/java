package arrayList;

import java.util.ArrayList;


public class new1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(2);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
        // arr.clear();
        arr.set(1, 9);
        System.out.println(arr);
        System.out.println(arr.size());
        // System.out.println(arr.get(2));


    }
}
