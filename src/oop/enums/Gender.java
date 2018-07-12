package oop.enums;

public enum Gender {
    MALE(false), FEMALE(true);

    private boolean hasLongHair;

    private Gender(boolean hasLongHair){
        this.hasLongHair = hasLongHair;
    }

    public boolean isHasLongHair() {
        return hasLongHair;
    }
}
