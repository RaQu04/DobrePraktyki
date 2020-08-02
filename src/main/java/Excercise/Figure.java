package Excercise;

public interface Figure extends Colourable, Positionable {

    double getCircuit();
    double getArea();

    default String introduce(){
        return "Jestem " + this.getClass().getSimpleName() +
                ", moje pole wynosi: " + getArea() +
                " a mój obwód: " + getCircuit() +
                " mój kolor to " + getColour() +
                " moje współrzętne to " + getX() + " " + getY();
    }


}
