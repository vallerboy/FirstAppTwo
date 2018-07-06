public class Methods {
    public static void main(String[] args) {
        System.out.println("Wynik to: " + add(5, 5));
        System.out.println("Wynik to: " + isPitagoras(5, 5, 5));
        System.out.println("Wynik to: " + getSumOfNumbers(595));
        System.out.println("Wynik to: " + isSquare(26));
        System.out.println("Wynik to: " + isCube(8));
        System.out.println("Wynik to: " + getDividersCount(8));
        System.out.println("Wynik to: " + getMaxDividersCountForNumbers());


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


    public static boolean isSquare(int number){
        return Math.sqrt(number) % 1 == 0;
    }

    public static boolean isPrime(int number){
        if(number == 1){
            return false;
        }else if(number == 2){
            return true;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0){
                return false;
            }
        }

        return true;
    }

    public static boolean isCube(int number){
        return Math.cbrt(number) % 1 == 0;
        // Math.pow(nubmer, 1D/3D) dzielenie 1/3 da wynik przyblizony
    }

    public static int getDividersCount(int number){
        int counter = 1;
        for (int i = 1; i <= number / 2; i++) {
            if(number % i == 0){
                counter++;
            }
        }
        return counter;
    }

    public static int getMaxDividersCountForNumbers(){
        int max = 0;
        int number = 0;
        for (int i = 2; i <= 10000; i++) {
            int dividers = getDividersCount(i);
            if(dividers > max){
                max = dividers;
                number = i;
            }
        }

        return number;
    }
}
