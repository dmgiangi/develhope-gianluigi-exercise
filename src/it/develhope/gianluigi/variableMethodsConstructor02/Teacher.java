package it.develhope.gianluigi.variableMethodsConstructor02;

public class Teacher {
    String teacherName;

    public Teacher(String name) {
        teacherName = name;
        System.out.printf("%nThe teacher was Created.%n%n");
    }

    public void assignGrade(Student alum, int finalGrade) {
        alum.grade = finalGrade;
    }
}
