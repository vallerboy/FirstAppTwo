package files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Task5Files {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ścieżkę dostępu: ");
        String filePath = scanner.nextLine();
        File file = new File(filePath);

        if(!file.exists()){
            System.exit(0);
        }

        List<String> lines = null;
        try {
            lines = Files.readAllLines(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Podaj slowo szukane: ");
        String toReplace = scanner.nextLine();
        System.out.println("Na jakie slowo zamienic: ");
        String replaceBy = scanner.nextLine();


        StringBuilder newString = new StringBuilder();
        for (String line : lines) {
            newString.append(line.replace(toReplace, replaceBy)).append(" ").append("\r\n");
        }

        try {
            Files.write(file.toPath(), newString.toString().getBytes(), StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}