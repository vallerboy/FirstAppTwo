public class Task10Loops {
    public static void main(String[] args) {
        int n = 5;

        //chojna
        for (int i = 1; i <= n; i++) {
            for (int i1 = n - i; i1 > 0; i1--) {
                System.out.print(" ");
            }
            for (int i1 = 0; i1 < (i * 2) - 1; i1 ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
