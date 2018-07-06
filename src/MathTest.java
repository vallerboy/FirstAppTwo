import javax.sound.midi.SysexMessage;

public class MathTest {
    public static void main(String[] args) {
        long firstStart = System.currentTimeMillis();
        double pow = Math.pow(123D, 10000D);
        long firstStop = System.currentTimeMillis();



        long secondStart = System.currentTimeMillis();
        double powTwo = 123D;
        for (int i = 0; i < 10000D; i++) {
            powTwo *= powTwo;
        }
        long secondStop = System.currentTimeMillis();

        System.out.println("Wynik math: " + (firstStop - firstStart));
        System.out.println("Wynik petli: " + (secondStop - secondStart));


        System.out.println(Math.cbrt(125D) % 1D == 0);
    }
}
