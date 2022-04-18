package it.develhope.gianluigi.defaultMethodsOverride;

import java.util.Objects;

public class Smartphone implements Cloneable{
    private String brandName;
    private String modelName;
    private int batteryMAh;
    private SmartphonePrice producerPrice;
    private SmartphonePrice retailPrice;

    public Smartphone (String brandName,
                       String modelName,
                       int batteryMAh,
                       SmartphonePrice producerPrice,
                       SmartphonePrice retailPrice) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.batteryMAh = batteryMAh;
        this.producerPrice = producerPrice;
        this.retailPrice = retailPrice;
    }

    @Override
    public String toString() {
        return String.format("***" +
                "%nModel Name: " + modelName +
                "%nBrand Name: " + brandName +
                String.format("%nBattery capacity: %d mAh", batteryMAh) +
                "%nPrice: " + producerPrice.toString() +
                "%nPrice: " + retailPrice.toString() +
                "%n***%n%n");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return batteryMAh == that.batteryMAh
                && Objects.equals(brandName, that.brandName)
                && Objects.equals(modelName, that.modelName)
                && producerPrice.equals(that.producerPrice)
                && retailPrice.equals(that.retailPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, modelName, batteryMAh, producerPrice, retailPrice);
    }

    @Override
    public Smartphone clone() throws CloneNotSupportedException {
        Smartphone clonedSmartphone = (Smartphone) super.clone();

        try {
            clonedSmartphone.retailPrice = retailPrice.clone();
            clonedSmartphone.producerPrice = producerPrice.clone();

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning SmartphonePrice throw an exception.");
            e.printStackTrace();
        }

        return clonedSmartphone;
    }
}

