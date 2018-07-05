public class Methods {
    public static void main(String[] args) {
        System.out.println("Wynik to: " + add(5, 5));
        System.out.println("Wynik to: " + isPitagoras(5, 5, 5));
        System.out.println("Wynik to: " + getSumOfNumbers(595));


    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

    public static int multipy(int a, int b){
        return a * b;
    }

    public static int divide(int a, int b){
        return a / b;
    }


    public static boolean isPitagoras(int a, int b, int c){
        return a * a + b * b == c * c;
    }

    public static int getSumOfNumbers(int number){
        int sum = 0;
        while (number != 0){
            sum += number % 10;
            number /= 10;
        }
        return  sum;
    }

    public static int getSumOfNumbersDifferent(int number){
        String stringOfNumber = String.valueOf(number);

        int sum = 0;
        for (int i = 0; i < stringOfNumber.length(); i++) {
            sum += Character.getNumericValue(stringOfNumber.charAt(i));
        }
        return  sum;
    }


}
