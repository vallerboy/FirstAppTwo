import java.util.Scanner;

public class Task1If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageAnswer = Integer.parseInt(scanner.nextLine());
        if(ageAnswer > 5){
            System.out.println("Jest wiekszy niz 5");
        }else{
            System.out.println("Nie jest wiekszy niz 5");
        }
    }
}
