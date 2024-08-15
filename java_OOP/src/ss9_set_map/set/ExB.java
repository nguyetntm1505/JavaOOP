package ss9_set_map.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ExB {
    //Viết một chương trình nhận vào một mảng số nguyên và sử dụng Set để tính tổng của các phần tử không trùng lặp trong mảng.
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 10, 20, 30, 40, 50, 60, 10, 20, 30);

        System.out.println("Danh sach ban dau: " + arrayList);

        System.out.println("Tong cac phan tu khong trung lap: " + sumUniqueArray(arrayList));
    }

    static int sumUniqueArray(ArrayList<Integer> arrayList) {
        Set<Integer> uniqueSet = new HashSet<>(arrayList);
        ArrayList<Integer> uniqueArraySet = new ArrayList<>(uniqueSet);

        return uniqueArraySet.stream().mapToInt(Integer::intValue).sum();
    }
}
