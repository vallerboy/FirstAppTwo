package exceptions;

import javax.swing.*;
import java.io.IOException;

public class ExTest {

    //SANDBOX
    public static void main(String[] args) {

        try {
            System.out.println(div(213, 0));
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null , "Wystąpił błąd");
        }
        System.out.println("Działa nadal");
    }

    /////////////////////////WY NIE WIDZICIE//////////////////////
    public static int div(int a, int b) throws IOException{
        if(b == 0){
            throw  new IOException("Do not divide by 0 ~Oskar");
        }

        return a /  b;
    }
}
