package staticTestOop;

public class Starter {
    public static void main(String[] args) {
        Value.setSomeText("hejo");
        Value.setSomeText("jeden dwa trzy");

        Value value = new Value();

        value.setSomeText("sialallala");
        Value.setSomeText("alalalalalong");


        System.out.println(value.getSomeText());

        Starter starter  = new Starter();
        starter.count();
    }

    public int count(){
        return 5;
    }
}
