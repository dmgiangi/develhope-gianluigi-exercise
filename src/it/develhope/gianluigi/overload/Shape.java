package it.develhope.gianluigi.overload;

public class Shape {
    String shapeName;
    int numberOfEdges;

    public Shape() {
        System.out.println("A new undefined shape was born!!!%n");
        this.shapeName = "Undefined shape";
        this.numberOfEdges = 0;
    }

    public Shape(double radius) {
        this.shapeName = "Circle";
        this.numberOfEdges = 0;
        System.out.println("A new Circle was born!!!");
        System.out.printf("It's radius is %f%n%n", radius);
    }

    public Shape(int numberOfEdges, double edgesLength) {
        this.shapeName = "Square";
        this.numberOfEdges = 4; //for the exercise here should be numberOfEdges;
        System.out.println("A new Square was born!!!");
        System.out.printf("It's edge's length is %f%n%n", edgesLength);
    }

    public Shape(int numberOfEdges, double majorBase, double minorBase) {
        this.shapeName = "Rectangle";
        this.numberOfEdges = 4; //for the exercise here should be numberOfEdges;
        System.out.println("A new Rectangle was born!!!");
        System.out.printf("It's Major base is %f and it's minor base is %f%n%n", majorBase, minorBase);
    }

    public Shape(double firstEdge, double secondEdge, double thirdEdge) {
        this.shapeName = "Triangle";
        this.numberOfEdges = 3;
        System.out.println("A new Triangle was born!!!");
        System.out.printf(
                "It's edges measure %f, %f and %f%n%n",
                firstEdge, secondEdge, thirdEdge
        );
    }

    public String getShapeDetails() {
        return String.format(
                        "%n+++ Shape Details +++%n" +
                        "this shape is: %s%n" +
                        "the number of its edges is: %d%n+++%n",
                shapeName, numberOfEdges);
    }
}
