package it.develhope.gianluigi.classesAndObject01;

/**
 * The Programmer class represents a data model of a programme
 */
public class Programmer {
    /**
     * the name of the programmer
     */
    private String name;
    /**
     * the age of the programmer
     */
    private int age;
    /**
     * true if the programmer wears glasses
     * false if the programmer doesn't wear glasses
     */
    private boolean wearsGlasses;

    /**
     * The main constructor of the data model
     *
     * @param name String contains the name of the programme
     * @param age int contains the age of the programmer
     * @param wearsGlasses boolean true if the programmer wears glasses false if not
     */
    Programmer(String name, int age, boolean wearsGlasses) {
        this.name = name;
        this.age = age;
        this.wearsGlasses = wearsGlasses;
    }

    /**
     * Print a string when this method is called
     */
    public void drinkCoffe() {
        System.out.printf("Espresso is the secret!\n");
    }

    /**
     * Print a string with format specifiers when this method is called
     */
    public void printDetails() {
        System.out.printf("%s is a %d-yo programmer\n", this.name, this.age);
    }

    /**
     * Print a string with format specifiers when this method is called
     */
    public void hasGlasses() {
        System.out.printf("Is %s wearing glasses? %b\n", this.name, this.wearsGlasses);
    }

    /**
     * setter for name
     * @param newName the new name of the programmer
     */
    public void setName(String newName) {
        this.name = newName;
    }

    /**
     * setter for age
     * @param newAge the new age of the programmer
     */
    public void setAge(int newAge) {
        this.age = newAge;
    }

    /**
     * setter for wearsGlasses
     * @param wearsGlasses true if the programmer wears glasses, false if not
     */
    public void setWearsGlasses(boolean wearsGlasses) {
        this.wearsGlasses = wearsGlasses;
    }
}
