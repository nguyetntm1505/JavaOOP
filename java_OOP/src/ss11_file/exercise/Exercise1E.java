package ss11_file.exercise;

import java.io.File;
import java.io.IOException;

public class Exercise1E {
    public static void main(String[] args) throws IOException {
        //e. Viết chương trình xóa 1 file.txt hoặc 1 thư mục cho trước.
        File file = new File("src/ss11_file/exercise/file.txt");

        if (file.exists()) {
            if(file.delete()){
                System.out.println("Da xoa thanh cong");
            }else{
                System.out.println("Khong the xoa");
            }
        } else {
            System.out.println("Duong dan khong ton tai");
        }
    }
}
