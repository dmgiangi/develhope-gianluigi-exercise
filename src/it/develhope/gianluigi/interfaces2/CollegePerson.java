package it.develhope.gianluigi.interfaces2;

public class CollegePerson {
    private String name;
    private String surname;
    private int collegeId;

    public CollegePerson(String name, String surname, int collegeId) {
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void goToCollege() {
        System.out.printf(
                "College Id : %d%n" +
                "Complete name: %s %s%n",
                collegeId,
                name,
                surname
        );
    }
}
