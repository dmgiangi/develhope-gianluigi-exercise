package it.develhope.gianluigi.exercises.classesAndObject01;

import it.develhope.gianluigi.exercises.classesAndObject01.Programmer;

public class TestProgrammers {
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
