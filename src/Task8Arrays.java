public class Task8Arrays {
    public static void main(String[] args) {

        int[] ints = {156,242,351,643,31,4,2,24,124,532,3431,243,134,534};

        String rest = "";
        for (int anInt : ints) {
            int numberRest = anInt % 37;
            rest +=  rest.contains(String.valueOf(numberRest)) ? "" :  String.valueOf(numberRest) + ":";
        }

        System.out.println(rest);
        System.out.println(rest.split(":").length);
    }
}
