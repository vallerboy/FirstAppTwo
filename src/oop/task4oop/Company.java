package oop.task4oop;

public class Company {
    private String name;
    private Employee[] employees;

    public Company(String name){
        this.name = name;
        employees = new Employee[3];
    }

    public void addEmployee(Employee employee){
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] == null){
                employees[i] = employee;
                break;
            }
        }
    }

    public void printNames(){
        for (Employee employee : employees) {
            System.out.println("Imie: " + employee.getName());
        }
    }

    //todo zrobic metode do kasy
}
