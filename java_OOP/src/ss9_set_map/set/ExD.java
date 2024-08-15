package ss9_set_map.set;

import java.util.*;

public class ExD {
    //Viết một chương trình nhận vào một mảng số nguyên và sử dụng Set để tìm phần tử lớn nhất và nhỏ nhất trong mảng.
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 10, 20, 30, 40, 50, 60, 50, 80, 40);
        System.out.println("Danh sach ban dau: " + arrayList);

        TreeSet<Integer> set = new TreeSet<>(arrayList);

        int min = set.first();
        int max = set.last();

        System.out.println("Phan tu lon nhat trong mang la: " + max);
        System.out.println("Phan tu nho nhat trong mang la: " + min);
    }
}
