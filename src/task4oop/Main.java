package task4oop;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Oskar", "Polak", 1900, 100, 1200);
        Employee employee1 = new Employee("Oskar1", "Polak1", 522, 52, 232232);
        Employee employee2 = new Employee("Oskar2", "Polak2", 4512, 122, 2312);


        Company company = new Company("AkademiaKodu");
        company.addEmployee(employee);
        company.addEmployee(employee1);
        company.addEmployee(employee2);

        company.printNames();
    }
}
