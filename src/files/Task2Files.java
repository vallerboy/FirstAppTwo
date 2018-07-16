package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
public class Task2Files {
    public static void main(String[] args) {
        File file = new File("C:\\asd\\hejo.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Scanner scanner = new Scanner(System.in);
        String answer;
        do{
            System.out.print("Wprowadź tekst: ");
            answer = scanner.nextLine();

            try {
                Files.write(file.toPath(), (answer + "\n").getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }while (!answer.equals("exit"));

    }
}
