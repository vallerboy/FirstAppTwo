package oop.generics;

public class Pair<T, Q> {
    private T first;
    private Q last;

    public Pair(T first, Q last) {
        this.first = first;
        this.last = last;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public Q getLast() {
        return last;
    }

    public void setLast(Q last) {
        this.last = last;
    }
}
