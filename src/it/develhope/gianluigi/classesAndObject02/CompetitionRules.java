package it.develhope.gianluigi.classesAndObject02;

public class CompetitionRules {
    private static final String competitionRule1 = "Do not copy and paste from StackOverflow!";
    private static final String competitionRule2 = "Learn every day!";
    private static final String competitionRule3 = "Be the best team!";

    public static void printRules() {
        System.out.printf(
                "Rules:\n\t- %s\n\t- %s\n\t- %s\n",
                competitionRule1,
                competitionRule2,
                competitionRule3
        );
    }
}
