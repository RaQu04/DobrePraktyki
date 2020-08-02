package Excercise;

public class Rectangle implements Figure, SuperFigure {
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getCircuit() {
        return (a * 2) + (b * 2);
    }

    @Override
    public double getArea() {
        return a * b;
    }


    @Override
    public void setColour(Colour colour) {

    }

    @Override
    public Colour getColour() {
        return null;
    }

    @Override
    public void setCoordinates(double x, double y) {

    }

    @Override
    public double getX() {
        return 0;
    }

    @Override
    public double getY() {
        return 0;
    }
}
