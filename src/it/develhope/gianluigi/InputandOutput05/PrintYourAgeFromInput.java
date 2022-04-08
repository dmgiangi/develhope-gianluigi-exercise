package it.develhope.gianluigi.InputandOutput05;

import it.develhope.gianluigi.Exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrintYourAgeFromInput implements Exercise {
    public String getName() {
        return "Input and Output - 05";
    }

    public void runExercise() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your age: ");
        int age = input.nextInt();
        System.out.printf("Your age is: %d%n", age);

        //input.close();
        //we cannot clos the scanner because he is created with a singleton pattern
    }
}
