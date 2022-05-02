package it.develhope.gianluigi.OtherOperators;

import it.develhope.gianluigi.Exercise;

public class TestingOtherOperators implements Exercise {
    @Override
    public String getName() {
        return "Other Operators";
    }

    @Override
    public void runExercise() {
        int a = 15;
        a += 5;
        a -= 4;
        int b = a;
        b++;

        assert (b % 2 == 1) : String.format("%n***Assertion***%n" +
                "b is not an odd number.");
        System.out.printf("%nb is an odd number: %b%n",
                b % 2);

        assert ((b * (b + 1)) % 3 == 0) : String.format("%n***Assertion***%n" +
                "b * (b + 1) is not a multiple of 3.");
        System.out.printf("%nb * (b + 1) is a multiple of 3: %b%n",
                (b * (b + 1)) % 3 == 0);
    }
}
