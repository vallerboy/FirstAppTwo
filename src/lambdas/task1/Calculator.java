package lambdas.task1;

import java.util.function.IntBinaryOperator;

public class Calculator {
    public static void main(String[] args) {
        //IntegerMath addition = (a, b) -> a + b;
        //IntegerMath sub = (a, b) -> a - b;

        operateBinary(5, 5, (a, b) -> a + b);


    }

    public static void operateBinary(int a, int b, IntBinaryOperator operation){
        System.out.println(operation.applyAsInt(a, b));
    }
}
