package Excercise;

public interface Figure {

    double getCircuit();
    double getArea();

    default String introduce(){
        return "Jestem " + getClass().getSimpleName() + ", moje pole wynosi: " + getArea() + " a mój obwód: " + getCircuit();
    }
}
