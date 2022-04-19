package it.develhope.gianluigi.interfaces2;

import it.develhope.gianluigi.Exercise;

public class Interfaces2Tester implements Exercise {
    @Override
    public String getName() {
        return "Interfaces 2";
    }

    @Override
    public void runExercise() {
        Student student = new Student(
                "Orazio",
                "Belvedere",
                1025632,
                3
        );
        Professor professor = new Professor(
                "Luca",
                "Rizzo",
                1025633,
                "Math"
        );
        Assistant assistant = new Assistant(
                "Giuseppe",
                "San Bernardi",
                1025634,
                true
        );

        student.goToCollege();
        professor.goToCollege();
        assistant.goToCollege();

        System.out.println();

        student.studyAtHome();
        professor.teachToOtherPeople();
        assistant.studyAtHome();
        assistant.teachToOtherPeople();
    }
}
