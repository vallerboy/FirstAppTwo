import java.util.Scanner;

public class Task8If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        if(word.charAt(0) == word.charAt(word.length() - 1)) {
            System.out.println("takie same sa te litery hehe");
        }else{
            System.out.println("nie");
        }

    }
}
