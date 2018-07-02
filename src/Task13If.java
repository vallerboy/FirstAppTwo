import java.util.Scanner;

public class Task13If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int someNumber = scanner.nextInt();

        if(someNumber % 5 == 0 || someNumber % 3 == 0){
            System.out.println("Tak");
        }else{
            System.out.println("Nie");
        }
    }
}
