package it.develhope.gianluigi.wildcard01;

import it.develhope.gianluigi.Exercise;

import java.util.ArrayList;
import java.util.List;

public class TesterWildcard01 implements Exercise {
    @Override
    public String getName() {
        return "Generics Wildcard 01";
    }

    @Override
    public void runExercise() {
        List<Double> individualMarksListLisa = new ArrayList<>();
        individualMarksListLisa.add(6.2);
        individualMarksListLisa.add(7.8);

        List<Integer> projectMarksListJeremy = new ArrayList<>();
        projectMarksListJeremy.add(9);
        projectMarksListJeremy.add(6);


        List<Student> students = new ArrayList<>();
        students.add(
                new Student(
                        "Lisa",
                        "Stuart",
                        Student.getAverageMarks(individualMarksListLisa)
                )
        );
        students.add(
                new Student(
                        "Jeremy",
                        "Green",
                        Student.getAverageMarks(projectMarksListJeremy)
                )
        );

        System.out.println(students.get(0));
        System.out.println(students.get(1));
    }
}
