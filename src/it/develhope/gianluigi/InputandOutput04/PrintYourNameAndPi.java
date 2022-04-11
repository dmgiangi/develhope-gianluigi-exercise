package it.develhope.gianluigi.InputandOutput04;

import it.develhope.gianluigi.Exercise;

import java.util.Locale;

public class PrintYourNameAndPi implements Exercise {
    public String getName() {
        return "Input and Output - 04";
    }

    public void runExercise() {
        System.out.printf("%S%n", "Gianluigi");
        System.out.print(String.format("The number Pi is: %.6f%n", 3.141590));
    }
}
