package extending;

public class Manager extends Worker {
    private int extraSalary;

    public Manager(String name, String surname, int salary, int extraSalary) {
        super(name, surname, salary);
        this.extraSalary = extraSalary;
    }

    public Manager(String name, String surname) {
        super(name, surname);
    }

    public int getExtraSalary() {
        return extraSalary;
    }

    public void setExtraSalary(int extraSalary) {
        this.extraSalary = extraSalary;
    }
}
