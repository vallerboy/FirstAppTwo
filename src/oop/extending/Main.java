package oop.extending;

public class Main {
    public static void main(String[] args) {
        Worker oskar = new Worker("Oskar", "Polak");
        System.out.println(oskar.getName());
        oskar.shout();

        Manager manager = new Manager("Adam", "Nawalka", 2000, -500);
        manager.setExtraSalary(1000);
        manager.shout();

        Worker oldManager = manager;

        Worker tomek = new Manager("Tomek", "Jakistam", 2000, 100);

        Boss bossOskar = new Boss("Oskar", "Polak", "Mesiu");
        bossOskar.kickOut(manager);
        bossOskar.kickOut(oskar);
        bossOskar.kickOut(tomek);

        bossOskar.shout();

        printMenu(oskar);
        printMenu(manager); //autokonwersja
        printMenu(tomek);
        printMenu(bossOskar);

        int age = 15;
        printNumber(age);
        printNumber(15);
    }

    public static void printMenu(Worker worker){
        System.out.println(worker.getName() + " "  + worker.getSurname());
    }

    public static void printNumber(int worker){
        System.out.println(worker);
    }


}
