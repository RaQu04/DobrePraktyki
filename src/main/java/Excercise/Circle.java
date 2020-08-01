package Excercise;

public class Circle implements Figure {
    private final double radius;

    public Circle(double r) {
        this.radius = r;
    }

    @Override
    public double getCircuit() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
