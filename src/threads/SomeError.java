package threads;

import java.util.Vector;

public class SomeError {
    public static void main(String[] args) {
        Value age = new Value();


        for (int i = 0; i < 5000; i++) {
            new SomeThreadTask(age).start();
            System.out.println(age.getAge());
        }



    }

    public static class Value{
        private int age;

        public  int getAge() {
            return age;
        }

        public  void action() {
            age = age + 1;
            age = age - 1;
        }


    }

    //Drugi sposob
    public static class SomeThreadTask extends Thread {
        private Value age;
        public SomeThreadTask(Value age) {
            this.age = age;
        }

        @Override
        public  void run() {
            makeAction();
        }

        private  void makeAction() {
            for (int i = 0; i < 5000; i++) {
                age.action();
            }
        }
    }

}
