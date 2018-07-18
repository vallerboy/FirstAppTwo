package lambdas;

public class LambdasTest {
    public static void main(String[] args) {
        Number pi = new Number() {
            @Override
            public double getValue() {
                return 3.14;
            }
        };
        // =====
        Number pi1 = () -> 3.14;
        // =====
        Number pi2 = () -> { return 3.14; };

        printNumber(() -> 10.3);
        printNumber(pi);
        printNumber(pi1);
    }

    public static void printNumber(Number number){
        System.out.println(number.getValue());
    }
}
