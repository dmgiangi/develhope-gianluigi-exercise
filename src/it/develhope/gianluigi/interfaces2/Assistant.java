package it.develhope.gianluigi.interfaces2;

public class Assistant extends CollegePerson implements LearningPerson, TeachingPerson{
    boolean isGoingToBeAPhD;

    public Assistant(String name, String surname, int collegeId, boolean isGoingToBeAPhD) {
        super(name, surname, collegeId);
        this.isGoingToBeAPhD = isGoingToBeAPhD;
    }

    @Override
    public void studyAtHome() {
        System.out.printf("The assistant %s %s is studying at home.%n",
                this.getName(), this.getSurname()
        );
    }

    @Override
    public void teachToOtherPeople() {
        System.out.printf("The professor %s %s is teaching.%n",
                this.getName(), this.getSurname()
        );
    }


    @Override
    public void goToCollege() {
        System.out.printf("%n*** Assistant data ****%n");
        super.goToCollege();
        System.out.printf(
                "on the way to the phd: %s%n",
                (isGoingToBeAPhD ? "Yes" : "No")
        );
        System.out.printf("***%n");
    }
}
