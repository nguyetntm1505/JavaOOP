package ss9_set_map.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExB {
    //b. Kiểm tra tính duy nhất của tên
    //Viết một chương trình nhận vào một danh sách các tên và sử dụng Map để kiểm tra xem tên nào là duy nhất (xuất hiện một lần) và tên nào xuất hiện nhiều lần.
    public static void main(String[] args) {
        ArrayList<String> danhSachTen = new ArrayList<>();
        danhSachTen.add("Nguyen thi minh nguyet");
        danhSachTen.add("Tran Quoc Toan");
        danhSachTen.add("Nguyen thi minh khai");
        danhSachTen.add("NGUYEN THI MINH NGUYET");
        danhSachTen.add("Nguyen thi thu hoa");
        danhSachTen.add("Nguyen Thi Minh Nguyet");

//        System.out.println("Danh sach ban dau: " );
//        for(String name: danhSachTen) {
//            System.out.println(name);
//        }

        Map<String, Integer> map = new HashMap<>();

        for (String name : danhSachTen) {
            name = name.toLowerCase();

            map.put(name, (map.getOrDefault(name,0) + 1));

//            if (map.containsKey(name)) {
//                map.put(name, map.get(name) + 1);
//            } else {
//                map.put(name, 1);
//            }
        }

        System.out.println("Ten xuat hien 1 lan: ");
        for (String name : map.keySet()) {
            if (map.get(name) == 1) {
                System.out.println(name);
            }
        }

        System.out.println("Ten xuat hien nhieu lan: ");
        for (String name : map.keySet()) {
            if (map.get(name) > 1) {
                System.out.println(name + " - " + map.get(name) + " lan");
            }
        }
    }
}
