package it.develhope.gianluigi.classesAndObject02;

import it.develhope.gianluigi.Exercise;

public class Competition implements Exercise {
    public String getName() {
        return "Classes and Objects - 02";
    }
    public void runExercise() {
        CompetitionRules competitionRules = CompetitionRules.getInstance();

        competitionRules.printRules();

        Team A = new Team(
                "Fenix",
                new Programmer(
                        "Giorgio",
                        "Python",
                        2
                ),
                new Programmer(
                        "Ugo",
                        "C, Asm",
                        4
                )
        );
        Team B = new Team(
                "Sphinx",
                new Programmer(
                        "Sara",
                        "Dart",
                        6
                ),
                new Programmer(
                        "Consuelo",
                        "Go",
                        3
                )
        );
        A.printTeamDetails();
        B.printTeamDetails();
    }
}