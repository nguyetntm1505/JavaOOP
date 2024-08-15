package ss11_file.exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exercise1D {
    public static void main(String[] args) throws IOException {
        //d. Viết chương trình kiểm tra xem 1 đường dẫn đang chỉ đến 1 file.txt hay 1 thư mục.
        File file = new File("src/ss11_file/exercise/file.txt");

        if (file.exists()) {
            if (file.isFile()) {
                System.out.println("Duong dan tro den 1 file");
            } else if (file.isDirectory()) {
                System.out.println("Duong dan tro den 1 thu muc");
            } else {
                System.out.println("Duong dan ton tai nhung khong tro den tep hay thu muc nao");
            }
        } else {
            System.out.println("Duong dan khong ton tai");
        }
    }
}
