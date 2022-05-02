package it.develhope.gianluigi.variableMethodsConstructor02;

import it.develhope.gianluigi.Exercise;

public class TestVariableMethodConstructor02 implements Exercise {
    @Override
    public String getName() {
        return "Variable Method Constructor - 02";
    }

    @Override
    public void runExercise() {
        Student s1 = new Student("Carlo");
        Student s2 = new Student("Giulia");

        Teacher t = new Teacher("Ottavio");

        t.assignGrade(s1, 3);
        t.assignGrade(s2, 9);

        s1.getStudentDetails();
        s2.getStudentDetails();
    }
}
