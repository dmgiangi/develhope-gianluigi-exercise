package it.develhope.gianluigi.classesAndObject01;


/**
 * the TestProgrammers class create 2 Programmer instance and use it
 */
public class TestProgrammers {
    /**
     * The runTest method implement the intent of the class.
     * the method is declared as static because our purpose is only to run the test,
     * and we don't need the instantiated object anymore.
     */
    public static void runTest() {
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
