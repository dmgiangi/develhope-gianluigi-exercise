package it.develhope.gianluigi.defaultMethodsOverride;

import it.develhope.gianluigi.Exercise;

public class Tester implements Exercise {
    /**
     * this method return the name of the exercise for the menu
     */
    public String getName() {
        return "default methods override";
    }

    /**
     * this method matches the main method for this exercises
     * test the functionality cloneable class that we have created
     */
    public void runExercise() {
        SmartphonePrice producerPriceA = new SmartphonePrice("Producer", 220.0d);
        SmartphonePrice producerPriceB = new SmartphonePrice("Producer", 525.0d);
        SmartphonePrice retailPriceA = new SmartphonePrice("Retail", 329.9d);
        SmartphonePrice retailPriceB = new SmartphonePrice("Retail", 599.9d);

        Smartphone smartphoneA = new Smartphone(
                "Mhuaei",
                "Reiki Node",
                3000,
                producerPriceA,
                retailPriceA
        );

        Smartphone smartphoneB = new Smartphone(
                "Pear",
                "Banana Phone X",
                6000,
                producerPriceB,
                retailPriceB
        );

        System.out.printf("Smartphone A:%n" + smartphoneA);
        System.out.printf("Smartphone B:%n" + smartphoneB);

        System.out.printf(
                "the smartphone A and B are" +
                (smartphoneA.equals(smartphoneB) ? " " : " not ")
                + "the same%n%n"
        );

        Smartphone smartphoneC;
        try {
            smartphoneC = smartphoneB.clone();
            System.out.printf("Smartphone C:%n" + smartphoneC);
            System.out.printf(
                            "the smartphone B and C are" +
                            (smartphoneB.equals(smartphoneC) ? " " : " not ")
                            + "the same.%n"
            );
        } catch (CloneNotSupportedException e) {
            System.out.println("+++ Impossible to clone the smartphone" + smartphoneB);
            e.printStackTrace();
        }


    }
}
