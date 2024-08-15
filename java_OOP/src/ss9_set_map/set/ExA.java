package ss9_set_map.set;

import java.util.*;

public class ExA {
    //Viết một chương trình nhận vào một mảng số nguyên và sử dụng Set để loại bỏ các phần tử trùng lặp, sau đó hiển thị danh sách các phần tử duy nhất.
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 10, 20, 30, 40, 50, 60, 50, 80, 40);
        System.out.println("Danh sach ban dau: " + arrayList);

        System.out.println("Danh sach sau khi loai bo cac phan tu trung lap: " + removeDuplicates(arrayList));

    }

    static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arrayList) {
        //lay ra cac phan tu uniqe trong mang
        Set<Integer> uniqueSet = new LinkedHashSet<>(arrayList);

        //add cac phan tu vao mang
        ArrayList<Integer> uniqueArrays = new ArrayList<>(uniqueSet);

        return uniqueArrays;
    }
}
