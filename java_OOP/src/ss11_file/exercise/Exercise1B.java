package ss11_file.exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exercise1B {
    public static void main(String[] args) throws IOException {
        // b. Viết chương trình đọc vào đúng 3 dòng của 1 file.txt. Sau đó hiển thị các dòng đọc được ra màn hình console.
        File file = new File("src/ss11_file/exercise/file.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            int count = 0;
            while ((line = bufferedReader.readLine()) != null && count < 3) {
                System.out.println(line);
                count++;
            }
            bufferedReader.close();
    }
}
