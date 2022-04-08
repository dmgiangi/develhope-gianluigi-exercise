package it.develhope.gianluigi.InputandOutput03;

import it.develhope.gianluigi.Exercise;

public class PrintYourNameAndSurname implements Exercise {
    public String getName() {
        return "Input and Output - 03";
    }

    public void runExercise() {
        System.out.println("Gianluigi");
        System.out.println("De Marco");
    }
}
