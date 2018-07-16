package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Task3Files {
    public static void main(String[] args) {
        File file = new File("C:\\asd\\hejo.txt");

        try {
            for (String s : Files.readAllLines(file.toPath())) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
