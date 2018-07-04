public class Task2Arrays {

    //Znajdz minimum z ciagu liczb
    public static void main(String[] args) {
        int[] ints = {5,2,1,135,431,0,12,413,413,124,2,24,123};

        int min = ints[0];
        for (int anInt : ints) {
            if(min > anInt){
                min = anInt;
            }
        }
        System.out.println(min);
    }
}
