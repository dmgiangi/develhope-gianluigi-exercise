package it.develhope.gianluigi.static1;

import it.develhope.gianluigi.Exercise;

public class TesterStatic implements Exercise {
    @Override
    public String getName() {
        return "Static";
    }

    @Override
    public void runExercise() {
        Employee employee1 = new Employee(
                "Luca",
                "Marongiu",
                "Via fasulla 123"
        );
        Employee employee2 = new Employee(
                "Gianna",
                "Gianna",
                "Via Sosteneva tesi e illusioni 321"
        );

        Badge badge1 = new Badge(employee1);
        badge1.showBadgeDetails();

        Badge badge2 = new Badge(employee2);
        badge2.showBadgeDetails();
    }
}
