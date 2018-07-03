public class SwitchTest {
    public static void main(String[] args) {
        int age = 84;

        switch (age) {
            case 70: {
                System.out.println("Znizka 70%");
                break;
            }

            case 60: {
                System.out.println("Znizka 60%");
                break;
            }

            case 50: {
                System.out.println("Znizka 50%");
                break;
            }

            default: {
                System.out.println("brak znizki");
            }
        }
    }
}
