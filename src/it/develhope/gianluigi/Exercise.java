package it.develhope.gianluigi;

/**
 * This interfaces allow the menu to act on every exercise in the same way
 */
public interface Exercise {
    /**
     * getName provides the name of the exercise.
     * I have not used an attribute because is static and final for definition in an interfaces
     * so in the class that implements this interfaces it'enough to return the name from this method
     * @return the name of the exercise
     */
    String getName();

    /**
     * runExercise simply is the start-point of the exercise
     */
    void runExercise();
}
