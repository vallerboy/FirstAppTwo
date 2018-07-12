package oop.enums;

public class Main {
    public static void main(String[] args) {
        Person oskar = new Person("Oskar",  Gender.MALE);

        if(oskar.getGender() == Gender.MALE){
            System.out.println("wohohoho");
            System.out.println(oskar.getGender().isHasLongHair());
        }else{
            System.out.println("o kurde");
        }

        System.out.println(DayOfWeek.SUNDAY.isWeekend());
    }
}
