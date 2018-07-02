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

        System.out.println(hello);
    }
}
