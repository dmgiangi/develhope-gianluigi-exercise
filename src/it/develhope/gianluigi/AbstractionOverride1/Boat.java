package it.develhope.gianluigi.AbstractionOverride1;

public class Boat extends Vehicle{
    double maxKnotsSpeed;
    int boatKilosWeight;

    public Boat(double maxKnotsSpeed, int boatKilosWeight) {
        this.type = "Boat";
        this.maxKnotsSpeed = maxKnotsSpeed;
        this. boatKilosWeight = boatKilosWeight;
    }

    public void getBoatWeightAndSpeed(){
        System.out.printf("Weight of the boat: %d%nMaximum Speed: %.1f Knots", boatKilosWeight, maxKnotsSpeed);
    }

    @Override
    public void doVehicleSound() {
        System.out.printf("Wrun Wlusch Wrun%n");
    }
}
