import java.util.Scanner;

public class Task2If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageAnswer = Integer.parseInt(scanner.nextLine());
        if(ageAnswer %  3 == 0){
            System.out.println("Liczba jest podzielna przez 3");
        }else{
            System.out.println("Nie jest");
        }


        int a = 5;
        int b = 6;

        int max = a > b ? a : b;
    }
}
