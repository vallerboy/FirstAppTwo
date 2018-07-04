public class Task7Arrays {
    public static void main(String[] args) {

        int[] ints = {1,2,3,4,4,4,5,6,6,78};

        for (int anInt : ints) {
            int counter = 0;
            for (int i : ints) {
                if(anInt == i){
                    counter ++;
                }
            }
            if(counter >= 3){
                System.out.println("TAK! " + anInt);
                break;
            }
        }
    }
}
