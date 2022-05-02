package it.develhope.gianluigi.variableMethodsConstructor01;

import it.develhope.gianluigi.Exercise;

public class TestVariableMethodConstructor01 implements Exercise {
    @Override
    public String getName() {
        return "Variable Method Constructor - 01";
    }

    @Override
    public void runExercise() {
        House house1 = new House();
        House house2 = new House();
    }
}
