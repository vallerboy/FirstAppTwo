package oop.taskBoxOOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj szerokosci: ");
        String[] widths = scanner.nextLine().split(" ");


        Box[] boxArray = new Box[widths.length];
        for (int i = 0; i < widths.length; i++) {
            boxArray[i] = new Box(Integer.parseInt(widths[i]));
        }

        Box boxDiagnoal = new Box();
        System.out.println(boxDiagnoal.joinDiagonal(boxArray));
    }
}
