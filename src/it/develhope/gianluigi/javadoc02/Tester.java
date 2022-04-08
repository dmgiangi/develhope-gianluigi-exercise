package it.develhope.gianluigi.javadoc02;

import it.develhope.gianluigi.Exercise;

/**
 * this class test the implementation of the ArithmeticOperator Class
 * implement the interface Exercise, so it can be used in the exercises menu
 *
 * @author Gianluigi De Marco
 */
public class Tester  implements Exercise {
    /**
     * this method return the name of the exercise for the menu
     */
    public String getName() {
        return "Javadoc 02";
    }

    /**
     * this method matches the main method for this exercises
     * test the functionality of the ArithmeticOperator Class
     */
    public void runExercise() {
        ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
        System.out.println(arithmeticOperators.sum(17,3));
        System.out.println(arithmeticOperators.sub(17,3));
        System.out.println(arithmeticOperators.mul(17,3));
        System.out.println(arithmeticOperators.div(17,3));
    }
}