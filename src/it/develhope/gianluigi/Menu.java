package it.develhope.gianluigi;

import it.develhope.gianluigi.InputandOutput01.PrintYourName;
import it.develhope.gianluigi.InputandOutput04.PrintYourNameAndPi;
import it.develhope.gianluigi.InputandOutput05.PrintYourAgeFromInput;
import it.develhope.gianluigi.OtherOperators.TestingOtherOperators;
import it.develhope.gianluigi.classesAndObject01.TestProgrammers;
import it.develhope.gianluigi.classesAndObject02.Competition;
import it.develhope.gianluigi.interfaces2.Interfaces2Tester;
import it.develhope.gianluigi.overload.TestingOverload;
import it.develhope.gianluigi.static1.TesterStatic;
import it.develhope.gianluigi.wildcard01.TesterWildcard01;
import it.develhope.gianluigi.wildcard02.TesterWildcard02;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * this class allow to generate a console menu that permit to execute every exercise.
 */
public class Menu {
    /**
     * this array of Exercise contains an instance of each exercise developed
     * thanks to the use of the interfaces we can manage the exercises in the same way
     */
    private final Exercise[] exercises = {
            new TestProgrammers(),
            new Competition(),
            new PrintYourName(),
            new it.develhope.gianluigi.InputandOutput02.PrintYourNameAndSurname(),
            new it.develhope.gianluigi.InputandOutput03.PrintYourNameAndSurname(),
            new PrintYourNameAndPi(),
            new PrintYourAgeFromInput(),
            new it.develhope.gianluigi.javadoc01.Tester(),
            new it.develhope.gianluigi.javadoc02.Tester(),
            new it.develhope.gianluigi.defaultMethodsOverride.Tester(),
            new it.develhope.gianluigi.abstractionOverride1.Tester(),
            new Interfaces2Tester(),
            new TestingOverload(),
            new TesterStatic(),
            new TesterWildcard01(),
            new TesterWildcard02(),

            new TestingOtherOperators()
    };

    /**
     * print the menu.
     * the first menu entry is the exit case then
     * it scrolls the array and print:
     * [the number of the exercise in the menu] - [name of the exercise]
     */
    private void printMenu() {
        System.out.printf("%n%n*** Gianluigi De Marco DevelHope exercises ***%n%n");
        System.out.println("0 - exit");
        for (int index = 1; index <= exercises.length; index++) {
            System.out.printf("%d - %s%n", index, exercises[index - 1].getName());
        }
    }

    /**
     * take the user choice
     * this method asks the user for his choice, manages the exception
     * and check that the choice is a valid menu number.
     *
     * @return the chosen menu entry
     */
    private int getChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice == -1) {
            System.out.print("Choose your option: ");
            try {
                choice = scanner.nextInt();
                if (choice < 0 || choice > exercises.length) {
                    System.out.println("Please insert an integer value between 0 and " + exercises.length);
                    choice = -1;
                }
            } catch (InputMismatchException ex) {
                System.out.println("The choice must be an integer.");
                scanner.next();
            } catch (Exception E) {
                System.out.println("Unhandled exception.... Sorry :(");
            }

        }
        System.out.println();
        return choice;
    }

    /**
     * this method permit waiting after the exercise execution so the user can read the result.
     */
    private void pressAnyKey() {
        System.out.printf("%nPress any key to return to the main menu.");
        try {
            //noinspection ResultOfMethodCallIgnored
            System.in.read();
        } catch (IOException e) {
            System.out.println("Input/Output unhandled exception.");
        }
    }

    /**
     * this method is the core of the menu
     * loop until the user don't insert 0 and start the chosen exercise
     */
    public void runMenu() {
        int choice = -1;
        while (choice != 0) {
            printMenu();
            choice = getChoice();
            if (choice != 0) {
                exercises[choice - 1].runExercise();
                pressAnyKey();
            }
        }
        System.out.printf("%nGoodBye!!!%n");
    }
}
