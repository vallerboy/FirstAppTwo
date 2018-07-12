package oop.generics;

public class Main {
    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(5);
        Box<Float> floatBox = new Box<>(5.434f);
        //Box<String> stringBox = new Box<>("adasd");

        System.out.println(floatBox.pow());



    }
}
