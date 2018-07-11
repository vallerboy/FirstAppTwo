package extending;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

import java.lang.reflect.WildcardType;

public class Main {
    public static void main(String[] args) {
        Worker oskar = new Worker("Oskar", "Polak");
        System.out.println(oskar.getName());


        Manager manager = new Manager("Adam", "Nawalka", 2000, -500);
        System.out.println(manager.());
    }
}
