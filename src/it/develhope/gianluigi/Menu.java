package it.develhope.gianluigi;

import it.develhope.gianluigi.classesAndObject01.TestProgrammers;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * this class allow to generate a console menu that permit to execute every exercise.
 */
public class Menu {
    /**
     * the scanner instance is a private attribute and is used to read from console the choice of the user.
     */
    private final Scanner scanner = new Scanner(System.in);

    /**
     * this array of Exercise contains an instance of each exercise developed
     * thanks to the use of the interfaces we can manage the exercises in the same way
     */
    private final Exercise[] exercises = {
            new TestProgrammers(),
            new TestProgrammers(),
    };

    /**
     * print the menu.
     * the first menu entry is the exit case then
     * it scrolls the array and print:
     * [the numeber of the exercise in the menu] - [name of the exercise]
     */
    private void printMenu() {
        System.out.println("\n\n*** Gianluigi De Marco DevelHope exercises ***\n");
        System.out.println("0 - exit");
        for(int index = 1; index <= exercises.length; index++) {
            System.out.printf("%d - %s\n", index, exercises[index-1].getName());
        }
    }

    /**
     * take the user choice
     * this method asks the user for his choice, manages the exeption
     * and check that the choice is a valid menu number.
     * @return the chosen menu entry
     */
    private int getChoice() {
        int choice = -1;
        while(choice == -1) {
            System.out.print("Choose your option: ");
            try{
                choice = scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("The choice must be an integer.");
                scanner.next();
            } catch (Exception E){
                System.out.println("Unhandled exception.... Sorry :(");
            }
            if(choice < 0 || choice > exercises.length){
                System.out.println("Please insert an integer value between 0 and " + exercises.length);
                choice = -1;
            }
        }
        System.out.println();
        return choice;
    }

    /**
     * this method is the core of the menu
     * loop until the user don't insert 0 and start the chosen exercise
     */
    public void runMenu(){
        int choice = -1;
        while (choice != 0) {
            printMenu();
            choice = getChoice();
            if(choice != 0) {
                exercises[choice-1].runExercise();
            }
        }
        System.out.println("\nGoodBye!!!");
    }
}
