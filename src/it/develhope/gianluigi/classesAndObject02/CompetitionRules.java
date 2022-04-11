package it.develhope.gianluigi.classesAndObject02;

public class CompetitionRules {
    private static final CompetitionRules competitionRules = new CompetitionRules();


    private CompetitionRules() {}

    public static CompetitionRules getInstance() {
        return competitionRules;
    }

    private final String competitionRule1 = "Do not copy and paste from StackOverflow!";
    private final String competitionRule2 = "Learn every day!";
    private final String competitionRule3 = "Be the best team!";

    public void printRules() {
        System.out.printf(
                "Rules:%n\t- %s%n\t- %s%n\t- %s%n",
                competitionRule1,
                competitionRule2,
                competitionRule3
        );
    }
}
