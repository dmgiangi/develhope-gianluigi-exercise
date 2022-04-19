package it.develhope.gianluigi.abstractionOverride1;

public abstract class Vehicle {
    public String type = "Vehicle";
    public int numberOfWheels = 0;

    public void showVehicleDetails() {
        System.out.printf("Vehicle Type: %s%nNumber of wheels: %d%n", type, numberOfWheels);
    }

    public abstract void doVehicleSound();
}
