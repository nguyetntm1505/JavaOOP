package ss11_file.exercise;

import java.io.File;
import java.io.IOException;

public class Exercise1F {
    public static void main(String[] args) throws IOException {
        //f. Viết chương trình đổi tên 1 file.txt hoặc 1 thư mục cho trước.
        File oldFile = new File("src/ss11_file/exercise/file.txt");

        File newFile = new File("src/ss11_file/exercise/newFile.txt");

        if (oldFile.exists()) {
            if(oldFile.renameTo(newFile)){
                System.out.println("Doi ten thanh cong.");
            }else{
                System.out.println("Doi ten that bai.");
            }
        } else {
            System.out.println("Tep hoac thu muc khong ton tai");
        }
    }
}
