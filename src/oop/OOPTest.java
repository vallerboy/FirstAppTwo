package oop;

public class OOPTest {
    public static void main(String[] args) {
        Troll troll1 =
                new Troll("Maly zabijaka", 5, 10, 20, 3);

        Troll troll22 =
                new Troll("Duzy zabijaka", 5, 10, 20, 3);




        Person person = new Person("Adam", "Kowalski", 45);
        person.setName("Jacek");
        person.shout();
        System.out.println(person.getName() +  " " + person.getSurname());

        Person personWithNull = new Person("Oskar");
        System.out.println(personWithNull.getName() + " " + personWithNull.getSurname());


        Person2 person2 = new Person2("Tomek", "Zawilski", 30, 'M');


        Car car = new Car("asd", "adsd", 24.23);
        car.show();
    }
}
