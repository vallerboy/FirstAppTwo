public class ArrayTest {
    public static void main(String[] args) {
        int[] someNumbers = {1,2,3,4,45,6,7,7,8};

        for(int oneNumber : someNumbers){
            oneNumber = 0;
        }
        someNumbers[0] = 0;


        int age = 12;
        test(age);
    }


    public static  void test(int TEST){
        TEST = 10;
    }
}
