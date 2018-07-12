package oop.extending;

public class Worker extends Employee{
    private String name;
    private String surname;
    private int salary;

    public Worker(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public Worker(String name, String surname) {
        this(name, surname, 0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void shout(){
        System.out.println("Wiecej pracy... WIECEJ!!!!!!!!! zart.");
    }
}

