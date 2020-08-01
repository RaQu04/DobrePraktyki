package Excercise;

public class Square implements Figure {
    private final double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getCircuit() {
        return a * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(a, 2);
    }

}
