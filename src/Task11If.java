import java.util.Scanner;

public class Task11If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        if(word.contains("kajak")){
            System.out.println("Zawiera kajak");
        }else{
            System.out.println("Nie zawiera kajaka");
        }

    }
}
