
public class Task15Loops {
    public static void main(String[] args) {
        String word = "Malina";

        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(word.length() - i - 1));
        }

        System.out.println(new StringBuilder(word).reverse().toString());
    }
}
