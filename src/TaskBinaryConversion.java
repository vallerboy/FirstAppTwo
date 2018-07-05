public class TaskBinaryConversion {
    public static void main(String[] args) {
        int number = 60;

        StringBuilder binaryRepresentation = new StringBuilder();

        while (number != 0) {
            binaryRepresentation.append(number % 2);
            number /= 2;
        }

        System.out.println(binaryRepresentation.reverse().toString());
    }
}
