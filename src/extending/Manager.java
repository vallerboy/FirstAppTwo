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

    public int getTotalSalary(){
        return  getSalary() + extraSalary;
    }

    @Override
    public void shout() {
        System.out.println("DO PRACY ***!*@^#181831736");
    }
}
