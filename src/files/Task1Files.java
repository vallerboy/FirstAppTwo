package files;

import java.io.File;

public class Task1Files {
    public static void main(String[] args) {
        File file = new File("D:\\cos\\jakisplik.txt");
        if (file.exists()) {
            System.out.println("cos");
        }else{
            System.out.println("cos nic");
        }
    }
}
