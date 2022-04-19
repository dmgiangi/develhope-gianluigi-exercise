package it.develhope.gianluigi.abstractionOverride1;

public class Car extends Vehicle{
    int numberOfDoors;
    double carPrice;

    public Car(int numberOfWheels, int numberOfDoors, double carPrice){
        this.type = "Car";
        this.numberOfWheels = numberOfWheels;
        this.numberOfDoors = numberOfDoors;
        this.carPrice = carPrice;
    }

    @Override
    public void showVehicleDetails() {
        super.showVehicleDetails();
        System.out.printf("Number of door%s: %d%n",
                (numberOfDoors == 1 ? "" : "s"),
                numberOfDoors);
    }

    @Override
    public void doVehicleSound() {
        System.out.printf("Bruummm!%n");
    }
}
