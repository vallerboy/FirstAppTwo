import java.util.Scanner;

public class Task7If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        if(word.endsWith("M") || word.endsWith("m")){
            System.out.println("konczy sie na m");
        }else{
            System.out.println("Nie konczy sie");
        }

        if(word.toLowerCase().endsWith("m")){
            System.out.println("konczy sie na m");
        }

    }
}
