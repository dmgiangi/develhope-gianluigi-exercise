package it.develhope.gianluigi.classesAndObject01;

public class Programmer {
    private String name;
    private int age;
    private boolean wearsGlasses;

    Programmer(String name, int age, boolean wearsGlasses) {
        this.name = name;
        this.age = age;
        this.wearsGlasses = wearsGlasses;
    }

    public void drinkCoffe() {
        System.out.printf("Espresso is the secret!\n");
    }

    public void printDetails() {
        System.out.printf("%s is a %d-yo programmer\n", this.name, this.age);
    }

    public void hasGlasses() {
        System.out.printf("Is NameHere wearing glasses? %b\n", this.wearsGlasses);
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setWearsGlasses(boolean wearsGlasses) {
        this.wearsGlasses = wearsGlasses;
    }
}
