package it.develhope.gianluigi.classesAndObject01;


import it.develhope.gianluigi.Exercise;

/**
 * the TestProgrammers class create 2 Programmer instance and use it
 * this class implements the Exercise interface
 */
public class TestProgrammers implements Exercise {
    /**
     * @return the name of the exercise
     */
    public String getName(){
        return "Classes and Objects - 01";
    }

    /**
     * The runExercise method implement the intent of the class.
     */
    public void runExercise() {
        Programmer firstProgrammer = new Programmer("Giulio", 23, false);
        Programmer secondProgrammer = new Programmer("Benedetta", 31, true);

        firstProgrammer.setName("Antonio");
        secondProgrammer.setAge(23);

        firstProgrammer.drinkCoffe();
        firstProgrammer.printDetails();

        secondProgrammer.printDetails();
        secondProgrammer.hasGlasses();
    }

}
