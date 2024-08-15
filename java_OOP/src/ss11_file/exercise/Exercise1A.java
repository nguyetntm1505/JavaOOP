package ss11_file.exercise;

import java.io.*;

public class Exercise1A {
    public static void main(String[] args) throws IOException {
        //a. Viết chương trình đọc vào tất cả các dòng của 1 file.txt.txt. Sau đó hiển thị tất cả thông tin đọc được trên cùng 1 dòng.
        File file = new File("src/ss11_file/exercise/file.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.print(line);
            }
            bufferedReader.close();
    }
}
