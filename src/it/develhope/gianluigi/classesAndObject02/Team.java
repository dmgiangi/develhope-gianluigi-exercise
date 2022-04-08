package it.develhope.gianluigi.classesAndObject02;

public class Team {
    private final String teamName;
    private final Programmer p1, p2;

    Team(String teamName, Programmer p1, Programmer p2){
        this.teamName = teamName;
        this.p1 = p1;
        this.p2 = p2;
    }
    public void printTeamDetails() {
        System.out.printf("\n*** Team: %s ***\n\n", teamName);
        p1.printProgrammerDetails();
        p2.printProgrammerDetails();
    }
}
