package oop.generics;

import oop.Person;

import java.io.Serializable;

public class Box<T extends Number>{
    private T type;



    public Box(T type) {
        this.type = type;
    }

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public double pow(){
        return  type.doubleValue() * type.doubleValue();
    }

}
