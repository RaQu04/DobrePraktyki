package Excercise;

public class Rectangle implements Figure {
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
        return a*b;
    }


}
