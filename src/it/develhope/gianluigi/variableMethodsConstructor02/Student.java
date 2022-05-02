package it.develhope.gianluigi.variableMethodsConstructor02;

public class Student {
    String name;
    int grade = -1;

    public Student(String name) {
        this.name = name;
    }

    public void getStudentDetails() {
        System.out.printf("%n*** Student Details***%n" +
                "Name: %s%n", this.name);
        if (grade != -1) {
            System.out.printf("Grade: %d%n", this.grade);
        }
        System.out.printf("***%n");
    }
}
