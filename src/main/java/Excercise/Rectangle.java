package Excercise;

public class Rectangle implements Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getCircuit() {
        return (a * 2) + (b * 2);
    }

    @Override
    public double getSurface() {
        return a*b;
    }

    @Override
    public void introduce() {
        System.out.println("Jestem prostokątem, moje pole wynosi: " + getSurface() + " a mój obwód: " + getCircuit());
    }
}
