import java.util.Scanner;


public class Task1Arrays {
    public static void main(String[] args) {
        Scanner sccanner = new Scanner(System.in);
//
//        String sentence = sccanner.nextLine();
//        String[] word = sentence.split(" ");
//
//        for (String s : word) {
//            System.out.println(s);
//        }
        /////////////////////////////////////

        int length = sccanner.nextInt();
        int[] emptyArray = new int[length];

        //tutaj uzupelniam
        for (int i = 0; i < length; i++) {
            emptyArray[i] = sccanner.nextInt();
        }

        //tutaj wypisuje odwrotnie
        for (int i = emptyArray.length - 1; i >= 0; i--) {
            System.out.println(emptyArray[i]);
        }



    }
}
