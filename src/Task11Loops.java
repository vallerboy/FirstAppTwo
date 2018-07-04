import java.util.Scanner;

public class Task11Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj wyraz z liczbami: ");
        String word = scanner.nextLine();
        for (int i = 0; i < word.length(); i++) {
            if(Character.isDigit(word.charAt(i))){
                System.out.print(word.charAt(i));
            }
        }
    }
}
