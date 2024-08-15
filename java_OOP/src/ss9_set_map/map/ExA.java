package ss9_set_map.map;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class ExA {
    //a. Đếm số lần xuất hiện của từ trong một văn bản
    //Viết một chương trình nhận vào một chuỗi văn bản và sử dụng Map để đếm số lần xuất hiện của từng từ trong văn bản.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap van ban: ");
        String text = scanner.nextLine();

        Map<String, Integer> worldCount = new HashMap<>();

        String[] words = text.split(" ");

        for (String word : words) {
            //chuyen doi thanh chu hoa thuong
            word = word.toLowerCase();

            if (worldCount.containsKey(word)) {
                worldCount.put(word, worldCount.get(word) + 1);//worldCount.get(word) get ra value cua key
            } else {
                worldCount.put(word, 1);
            }
        }

        for (String word : worldCount.keySet()) {
            System.out.println(word + ":" + worldCount.get(word));
        }

    }
}
