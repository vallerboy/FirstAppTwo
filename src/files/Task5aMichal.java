package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class Task5aMichal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj sciezke pliku:");
        File file = new File(scanner.nextLine());

        if(!file.exists()){
                System.out.println("Podany plik nie istnieje!");
                return;
        }

            System.out.println("Jakie slowo chcesz zamienic?");
            String wordOld = scanner.nextLine();

            System.out.println("Podaj nowe slowo:");
            String wordNew = scanner.nextLine();

            String content = null;
            try {
                content = new String(Files.readAllBytes(file.toPath()));
                content = content.replace(wordOld, wordNew);

                Files.write(file.toPath(), content.getBytes());

            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(content);


    }
}