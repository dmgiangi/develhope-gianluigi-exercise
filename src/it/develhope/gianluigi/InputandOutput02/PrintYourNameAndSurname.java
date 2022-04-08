package it.develhope.gianluigi.InputandOutput02;

import it.develhope.gianluigi.Exercise;

public class PrintYourNameAndSurname implements Exercise {
    public String getName() {
        return "Input and Output - 02";
    }

    public void runExercise() {
        System.out.print("Gianluigi ");
        System.out.println("De Marco");
    }
}
