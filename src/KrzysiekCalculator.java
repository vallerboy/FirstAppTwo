import java.util.Scanner;

public class KrzysiekCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operation;
        System.out.println("Dostępne operację: ");
        System.out.println("1 - mnożenie");
        System.out.println("2 - dzielenie");
        System.out.println("3 - potęgowanie");
        System.out.println("4 - pierwiastkowanie");
        System.out.println("5 - zamiena liczbę całkowitą na binarną");
        System.out.println("6 - zamiana liczby binarnej na całkowitą");
        System.out.println("7 - obliczenie NWD");
        System.out.println("8 - obliczyć średnią arytmetyczną");
        System.out.println("9 - sprawdzić czy w zbiorze znajduje się liczba która jest większa niż suma pozostałych");
        System.out.println("10 - EXIT");

        do {
            System.out.println("Wpisz numer rządanej operacji: ");
            operation = Integer.parseInt(scanner.nextLine());
            switch (operation) {
                case 1: {
                    System.out.println("WYBRAŁEŚ MNOŻENIE");
                    System.out.println("Podaj pierwszą liczbę: ");
                    int firstNumber = Integer.parseInt(scanner.nextLine());
                    System.out.println("Podaj drugą liczbę: ");
                    int secondNumber = Integer.parseInt(scanner.nextLine());
                    System.out.print("Wynik mnożenia to: " + (firstNumber * secondNumber));
                    break;
                }
                case 2: {
                    System.out.println("WYBRAŁEŚ DZIELENIE");
                    System.out.println("Podaj pierwszą liczbę: ");
                    double firstNumber1 = Double.parseDouble(scanner.nextLine());
                    System.out.println("Podaj drugą liczbę: ");
                    double secondNumber1 = Double.parseDouble(scanner.nextLine());
                    do {
                        if (secondNumber1 == 0) {
                            System.out.println("Nie można dzielić przez 0!!!!!!. Podaj drugą liczbę: ");
                            secondNumber1 = Double.parseDouble(scanner.nextLine());
                        }
                    } while (secondNumber1 == 0);
                    System.out.println("Wynik dzielenia to: " + (firstNumber1 / secondNumber1));
                    break;
                }
                case 3: {
                    System.out.println("WYBRAŁEŚ POTĘGOWANIE");
                    System.out.println("Podaj podstawe potęgi: ");
                    int baseOfThePower = Integer.parseInt(scanner.nextLine());
                    System.out.println("Podaj wykładnik: ");
                    int indicatorPower = Integer.parseInt(scanner.nextLine());
                    System.out.println("Wynik potęgowania to: " + Math.pow(baseOfThePower, indicatorPower));
                    break;
                }
                case 4: {
                    System.out.println("WYBRAŁEŚ PIERWIASTKOWANIE");
                    System.out.println("Podaj liczbę do spierwiastkowania: ");
                    double sqrtNumber = Double.parseDouble(scanner.nextLine());
                    System.out.print("Wynik pierwiastkowania to: " + Math.sqrt(sqrtNumber));
                    break;
                }
                case 5: {
                    System.out.println("WYBRAŁEŚ ZAMIĄNĘ LICZBY CAŁKOWITEJ NA BINARNĄ");
                    System.out.println("Podaj liczbę do zamiany: ");
                    int integerNumber = Integer.parseInt(scanner.nextLine());
                    String binaryNumber = Integer.toBinaryString(integerNumber);
                    System.out.println("Postać binarna podanej liczby to: " + binaryNumber);
                    break;
                }
                case 6: {
                    System.out.println("WYBRAŁEŚ ZAMIANĘ LICZBY BINANREJ NA CAŁKOWITĄ");
                    System.out.println("Podaj liczbę w postaci binarnej: ");
                    String binaryNumber1 = scanner.nextLine();
                    int integerNumber1 = Integer.parseInt(binaryNumber1, 2);
                    System.out.println("Liczba całkowita to: " + integerNumber1);
                    break;
                }
                case 7: {
                    System.out.println("WYBRAŁEŚ OBLICZENIE NWD");
                    System.out.println("Podaj pierwszą liczbę: ");
                    int NWDNumber1 = Integer.parseInt(scanner.nextLine());
                    System.out.println("Podaj druga liczbę: ");
                    int NWDNumber2 = Integer.parseInt(scanner.nextLine());
                    while (NWDNumber1 != NWDNumber2) {
                        if (NWDNumber1 > NWDNumber2) {
                            NWDNumber1 -= NWDNumber2;
                        } else {
                            NWDNumber2 -= NWDNumber1;
                        }
                    }
                    System.out.println("Największy wspólny dzielnik podanych liczb to: " + NWDNumber1);
                    break;
                }
                case 8: {
                    System.out.println("WYBRAŁEŚ OBLICZANIE ŚREDNIEJ ARYTMETYCZNEJ");
                    System.out.println("Podaj liczby z których chcesz policzyć srednią (rozdziel je spacjami): ");
                    String sentence = scanner.nextLine();
                    String[] numbers = sentence.split(" ");
                    int sum = 0;
                    for (String number : numbers) {
                        sum += Integer.parseInt(number);
                    }
                    System.out.println("średnia z podanych liczb to: " + (sum / (double) numbers.length));
                    break;
                }
                case 9: {
                    System.out.println("WYBRAŁEŚ SPRAWDZENIE CZY JEDNA LICZBA W ZBIORZE JEST WIĘKSZA OD SUMY POZOSTAŁYCH");
                    System.out.println("Ile liczb chcesz podać?: ");
                    int arrayLength = Integer.parseInt(scanner.nextLine());
                    int[] array = new int[arrayLength];
                    for (int i = 0; i < arrayLength; i++) {
                        System.out.println("Podaj " + (i + 1) + " element zbioru");
                        array[i] = Integer.parseInt(scanner.nextLine());
                    }
                    System.out.println("Twoja tablica to: ");
                    for (int i : array) {
                        System.out.print(i + "\t");
                    }
                    System.out.println();
                    int sum1 = 0;
                    int max = Integer.MIN_VALUE;
                    for (int i = 0; i < arrayLength; i++) {
                        max = max < array[i] ? array[i] : max;
                        sum1 = array[i] - max;
                    }
                    if (max > sum1) {
                        System.out.println("Tak w zbiorze jest jedna liczba większa od sumy pozostałych");
                    } else {
                        System.out.println("W zbiorze nie ma liczby, która by była większa od pozostałych");
                    }
                    break;
                }
                default: {
                    System.out.println("Nie znam takiej operacji");
                    break;
                }
            }
        }
        while (operation != 10);
        System.out.println("WYSZŁEŚ Z APLIKACJI!!!!!!!!!!!!");
    }
}
