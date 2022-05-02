package it.develhope.gianluigi.variableMethodsConstructor01;

public class House {
    String Address;
    int numberOfFloors;

    public House() {
        System.out.printf("%n***%nHouse was instantiated as %s.%n***%n", this.getClass());
    }
}
