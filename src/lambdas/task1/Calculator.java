package lambdas.task1;

public class Calculator {
    public static void main(String[] args) {
        //IntegerMath addition = (a, b) -> a + b;
        //IntegerMath sub = (a, b) -> a - b;

        //operateBinary(5, 5, (a, b) -> a + b);
        operateBinary(5, 5, new IntegerMath() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        });

    }

    public static void operateBinary(int a, int b, IntegerMath operation){
        System.out.println(operation.calculate(a, b));
    }
}
