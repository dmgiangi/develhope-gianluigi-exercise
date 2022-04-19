package it.develhope.gianluigi.abstractionOverride1;

import it.develhope.gianluigi.Exercise;

public class Tester implements Exercise {
    @Override
    public String getName() {
        return "Abstraction Override 1";
    }

    @Override
    public void runExercise() {
        Car car = new Car(4,5,30000.0d);
        Boat boat = new Boat(6.5d,2500);

        car.showVehicleDetails();
        car.doVehicleSound();

        System.out.printf("%n%n");

        boat.showVehicleDetails();
        boat.doVehicleSound();
        boat.getBoatWeightAndSpeed();

        System.out.printf("%n");
    }
}
