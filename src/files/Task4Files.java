package files;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

public class Task4Files {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kindToCreate;
        do {
            System.out.println("1 - Utwórz plik");
            System.out.println("2 - Utwórz katalog");
            System.out.println("3 - Wyjdz");
            System.out.print("Wybierz: ");
            kindToCreate = scanner.nextLine();

            System.out.print("Podaj path: ");
            String path = scanner.nextLine();

            File file = new File(path);
            if(kindToCreate.equals("1")){
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else if(kindToCreate.equals("2")){
                file.mkdirs();
            }
        }while (!kindToCreate.equals("3"));
    }
}
