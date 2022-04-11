package it.develhope.gianluigi;

/**
 * This interfaces allow the menu to act on every exercise in the same way
 */
public interface Exercise {
    /**
     * getName provides the name of the exercise.
     *
     * @return the name of the exercise
     */
    String getName();

    /**
     * runExercise simply is the start-point of the exercise
     */
    void runExercise();
}
