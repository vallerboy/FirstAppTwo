import java.util.Scanner;

public class Task6If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();

        if(one < two && one < three){
            System.out.println(one);
        }else if(two < three){
            System.out.println(two);
        }else{
            System.out.println(three);
        }

    }
}
