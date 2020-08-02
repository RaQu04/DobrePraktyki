package Excercise;


public interface Colourable {

    enum Colour {
        BLACK, WHITE, RED
    }

    void setColour(Colour colour);
    Colour getColour();
}
