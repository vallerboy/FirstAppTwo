public class Task18Loops {
    public static void main(String[] args) {

        int a = 50;
        int b = 25;

        while (a != b){
            if(a > b){
                a -= b;
            }else{
                b -= a;
            }
        }

        System.out.println(a);
    }
}
