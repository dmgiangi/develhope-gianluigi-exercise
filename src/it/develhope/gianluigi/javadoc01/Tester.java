package it.develhope.gianluigi.javadoc01;

import it.develhope.gianluigi.Exercise;

/**
 * this class test the implementation of the WordGames Class
 * implement the interface Exercise, so it can be used in the exercises menu
 *
 * @author Gianluigi De Marco
 */
public class Tester implements Exercise {
    /**
     * this method return the name of the exercise for the menu
     */
    public String getName() {
        return "Javadoc 01";
    }

    /**
     * this method matches the main method for this exercises
     * test the functionality of the WordGames Class
     */
    public void runExercise() {
        WordGames wordGames = new WordGames();
        System.out.println(wordGames.addHelloWord("World"));
        System.out.println(wordGames.getFullName("Gianluigi", "De Marco"));
    }
}