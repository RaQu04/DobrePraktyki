package Excercise;

public class Circle implements Figure {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getCircuit() {
        return 2 * Math.PI * r;
    }

    @Override
    public double getSurface() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public void introduce() {
        System.out.println("Jestem kołem, moje pole wynosi: " + getSurface() + " a mój obwód: " + getCircuit());
    }
}
