package it.develhope.gianluigi.interfaces2;

public class Student extends CollegePerson implements LearningPerson {
    private int academicYear;

    public Student(String name, String surname, int collegeId, int academicYear) {
        super(name, surname, collegeId);
        this.academicYear = academicYear;
    }

    @Override
    public void studyAtHome() {
        System.out.printf("the student %s %s is studying at home.%n",
                this.getName(), this.getSurname()
        );
    }

    @Override
    public void goToCollege() {
        System.out.printf("%n*** Student data ****%n");
        super.goToCollege();
        System.out.printf("Academic Year: %d%n", academicYear);
        System.out.printf("***%n");
    }
}
