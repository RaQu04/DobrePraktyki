package Excercise;

public class Triangle implements Figure {

    private final double a;
    private final double b;


    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double getCircuit() {
        return a + b + getCWall(a, b);
    }

    @Override
    public double getArea() {
        return (a * b) / 2.0;
    }

    static double getCWall(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }


}
