package oop.staticTestOop;

public class Value {
    private static String someText;

    public static String getSomeText() {
        return someText;
    }

    public static void setSomeText(String someText) {
        Value.someText = someText;
    }
}
