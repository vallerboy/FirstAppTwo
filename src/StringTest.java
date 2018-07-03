import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.math.BigDecimal;
import java.util.Scanner;
import java.math.BigInteger;

public class StringTest {
    public static void main(String[] args) {
        Integer someNumber1 = new Integer(1);
        Integer someNumber2 = new Integer(1);

        int someNumber3 = 1;
        int someNumber4 = 1;

//        if(someNumber3 == someNumber4){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }


        String hello = "Hello World!";
        hello = hello.replace("e", "o");

        double cos2 = 2.0;
        double cos3 = 1.1;
//        System.out.println(cos2 - cos3);


        BigDecimal someNumber = new BigDecimal(String.valueOf(cos2));
        BigDecimal someNumberTwo = new BigDecimal("1.1");


        Scanner scanner = new Scanner(System.in);
        //String nameTyped = scanner.nextLine();
        String nameStatic = "Oskar";



        String wiooo = "asdsadsa" + "asdasasd" + " asdsasdasdsa";

        String test = new StringBuilder().append("Ala ").append(" ma ").append("kota").toString();


        String text = " \" Mowa jest srebrem a milczenie złotem \"  ";

        long timeStart = System.currentTimeMillis();
        StringBuilder numbers = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            numbers.append(i);
        }
        long stopTime = System.currentTimeMillis();

        System.out.println(stopTime - timeStart);


        String someText = "asdsad*fsd";
        someText = someText.replace("*", "");

        System.out.println(someText);
    }
}
