package it.develhope.gianluigi.interfaces2;

public class Professor extends CollegePerson implements TeachingPerson {
    String teachingSubject;

    public Professor(String name, String surname, int collegeId, String teachingSubject) {
        super(name, surname, collegeId);
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void teachToOtherPeople() {
        System.out.printf("The professor %s %s is teaching %s.%n",
                this.getName(), this.getSurname(), teachingSubject
        );
    }

    @Override
    public void goToCollege() {
        System.out.printf("%n*** Professor data ****%n");
        super.goToCollege();
        System.out.printf("Teaching Subject: %s%n", teachingSubject);
        System.out.printf("***%n");
    }
}
