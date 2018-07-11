package extending;

public class Boss extends Manager {
    private String car;

    public Boss(String name, String surname, String car) {
        super(name, surname, Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.car = car;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public void kickOut(Worker worker){
        System.out.println("Wyrzucam: " + worker.getName() + " " + worker.getSurname());
    }

    @Override
    public void shout() {
        System.out.println("do jakiej restauracji dzis pojechac?!!!!!!!!");
    }
}
