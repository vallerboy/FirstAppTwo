package oop.enums;

public enum DayOfWeek {
    MONDAY(), TUESDAY(), WEDNESDAY(),
    THURSDAY(), FRIDAY(), SATURDAY(true), SUNDAY(true);

    private boolean isWeekend;

    DayOfWeek(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    DayOfWeek(){
        this.isWeekend = false;
    }

    public boolean isWeekend() {
        return isWeekend;
    }
}
