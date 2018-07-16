package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("C:\\asd\\hejo.txt");

        List<String> lines = null;
        try {
            lines =  Files.readAllLines(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        String someText = "Hejo!!!!!\t\r\n";

        try {
            Files.write(file.toPath(), someText.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }


        for (String line : lines) {
            System.out.println(line);
        }
    }
}
