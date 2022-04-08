package it.develhope.gianluigi.classesAndObject02;

public class Programmer {
    public final String name;
    public final String programingLanguage;
    public final int yearsOfExperience;

    Programmer(String name, String programingLanguage, int yearsOfExperience) {
        this.name = name;
        this.programingLanguage = programingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }

    public void printProgrammerDetails() {
        System.out.printf(
                "name: %s,%nProgramming Language: %s%nYears of experience: %s%n",
                name,
                programingLanguage,
                yearsOfExperience
        );
    }
}
