package oop;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age, String eyeColor){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age){
        this(name, surname, age, null);
    }

    public Person(String name, String surname){
        this(name, surname, 0);
    }

    public Person(String name){
        this(name, null);
    }


    public String getName(){
        return  name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void shout(){
        System.out.println("krzyyyyyczeeeeeee");
    }
}
