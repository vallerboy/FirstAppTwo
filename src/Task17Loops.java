public class Task17Loops {
    public static void main(String[] args) {
        String name = "Dorota";

        for (int i = 0; i < name.length(); i += 2) {
            System.out.print(name.charAt(i));
        }
    }
}
