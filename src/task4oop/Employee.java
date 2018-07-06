package task4oop;

public class Employee {
    private String name;
    private String surname;
    private int birthyear;
    private int seniority;
    private int salary;

    public Employee(String name, String surname, int birthyear, int seniority, int salary) {
        this.name = name;
        this.surname = surname;
        this.birthyear = birthyear;
        this.seniority = seniority;
        this.salary = salary;
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

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
