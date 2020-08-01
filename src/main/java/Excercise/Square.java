package Excercise;

public class Square implements Figure {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getCircuit() {
        return a*4;
    }

    @Override
    public double getSurface() {
        return Math.pow(a, 2);
    }

    @Override
    public void introduce() {
        System.out.println("Jestem kwadratem, moje pole wynosi: " + getSurface() + " a mój obwód: " + getCircuit());
    }
}
