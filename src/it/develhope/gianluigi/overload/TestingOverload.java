package it.develhope.gianluigi.overload;

import it.develhope.gianluigi.Exercise;

public class TestingOverload implements Exercise {
    @Override
    public String getName() {
        return "Overload";
    }

    @Override
    public void runExercise() {
        Shape undefinedShape = new Shape();
        String undefinedShapeDetails = undefinedShape.getShapeDetails();

        Shape circle = new Shape(22.9);
        String circleDetails = circle.getShapeDetails();

        Shape square = new Shape(4, 54.3);
        String squareDetails = square.getShapeDetails();

        Shape rectangle = new Shape(4, 30.0, 15.0);
        String rectangleDetails = rectangle.getShapeDetails();

        Shape Triangle = new Shape(20.0, 20.0, 20.0);
        String triangleDetails = Triangle.getShapeDetails();

        System.out.println(undefinedShapeDetails);
        System.out.println(circleDetails);
        System.out.println(squareDetails);
        System.out.println(rectangleDetails);
        System.out.println(triangleDetails);
    }
}
