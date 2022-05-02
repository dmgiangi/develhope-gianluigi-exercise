package it.develhope.gianluigi.wildcard02;

import it.develhope.gianluigi.Exercise;

public class TesterWildcard02 implements Exercise {
    @Override
    public String getName() {
        return "Generics Wildcard 02";
    }

    @Override
    public void runExercise() {
        GenericsClass<Integer> firstElement = new GenericsClass<>();
        GenericsClass<Integer> secondElement = new GenericsClass<>();
        GenericsClass<String> thirdElement = new GenericsClass<>();
        GenericsClass<String> fourthElement = new GenericsClass<>();

        firstElement.setT(12);
        secondElement.setT(13);
        thirdElement.setT("This is a String");
        fourthElement.setT("This is a String");

        System.out.printf("%nFirs and second element are equals: %B%n",
                GenericsClass.isEqual(firstElement, secondElement));
        System.out.printf("%nFirs and second element are equals: %B%n",
                GenericsClass.isEqual(thirdElement, fourthElement));
    }
}
