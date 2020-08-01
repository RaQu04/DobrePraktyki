package Excercise;

public class Triangle implements Figure {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public double getCircuit() {
        return a + b + getCWall(a, b);
    }

    @Override
    public double getSurface() {
        return (a * b) / 2.0;
    }

    static double getCWall(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    @Override
    public void introduce() {
        System.out.println("Jestem trójkątem, moje pole wynosi: " + getSurface() + " a mój obwód: " + getCircuit());
    }
}
