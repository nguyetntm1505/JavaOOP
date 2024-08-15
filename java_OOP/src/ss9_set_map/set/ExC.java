package ss9_set_map.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ExC {
    //Viết một chương trình nhận vào hai mảng số nguyên và sử dụng hai Set để tìm các phần tử chung giữa hai mảng.
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        Collections.addAll(arrayList1, 10, 20, 30, 40, 50, 60, 10, 20, 30);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        Collections.addAll(arrayList2, 10, 25, 30, 35, 50, 60, 5, 25, 30);

        System.out.println("Danh sach ban dau cua mang 1: " + arrayList1);
        System.out.println("Danh sach ban dau cua mang 2: " + arrayList2);

        System.out.println("Danh sach cac phan tu chung giua 2 mang la: " + commonElement(arrayList1, arrayList2));

    }

    static ArrayList<Integer> commonElement(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {
        Set<Integer> uniqueSet1 = new HashSet<>(arrayList1);
        Set<Integer> uniqueSet2 = new HashSet<>(arrayList2);

        uniqueSet1.retainAll(uniqueSet2);

        ArrayList<Integer> commonElement = new ArrayList<>(uniqueSet1);

        return commonElement;
    }
}
