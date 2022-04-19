package it.develhope.gianluigi.wildcard01;


import java.util.List;

public class Student {
    private String name;
    private String surname;
    private double marksAverage;

    public Student(String name, String surname, double marksAverage) {
        this.name = name;
        this.surname = surname;
        this.marksAverage = marksAverage;
    }

    public static double getAverageMarks(List<? extends Number> listOfMarks) {
        return (listOfMarks.get(0).doubleValue() + listOfMarks.get(1).doubleValue()) / 2;
    }

    @Override
    public String toString() {
        return String.format(
                "%n*** Student detail ***%n" +
                        "Complete name: %s %s%n" +
                        "Marks average: %.2f%n" +
                        "***%n",
                name, surname, marksAverage
        );
    }
}
