package it.develhope.gianluigi.InputandOutput04;

import it.develhope.gianluigi.Exercise;

public class PrintYourNameAndPi implements Exercise {
    public String getName() {
        return "Input and Output - 04";
    }

    public void runExercise() {
        System.out.printf("%S%n", "Gianluigi");
        System.out.printf("The number Pi is: %f%n", 3.141590);
    }
}
