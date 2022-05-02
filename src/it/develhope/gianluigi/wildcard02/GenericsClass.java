package it.develhope.gianluigi.wildcard02;

import java.util.Objects;

public class GenericsClass<T> {
    private T t;

    public static boolean isEqual(GenericsClass<?> gc1, GenericsClass<?> gc2) {
        if (gc1 == null || gc2 == null || gc1.getT() == null || gc2.getT() == null) return false;
        if (gc1.getT() == gc2.getT()) return true;
        if (gc1.getT().getClass() != gc2.getT().getClass()) return false;
        return Objects.equals(gc1.getT(), gc2.getT());
    }

    public T getT() {
        return t;
    }

    public void setT(T valueToSet) {
        this.t = valueToSet;
    }
}
