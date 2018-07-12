package oop.task10oop;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1, 2);
        Point2D point2D1 = new Point2D(1, 2);

        if(point2D.equals(point2D1)) {
            System.out.println("Sa takie samse");
        }else{
            System.out.println("nie sa takie same");
        }


    }
}
