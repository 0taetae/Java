package p0726.buffered;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ProcessingTextReadTest {
    public static void main(String[] args) {
        File src = new File("./.project");
        try (BufferedReader br = new BufferedReader(new FileReader(src));) {
            String line = null;
            while ((line = br.readLine()) != null) {  // 한 줄 단위로 읽을 수 있음
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
