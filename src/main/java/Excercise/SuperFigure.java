package Excercise;

public interface SuperFigure extends Figure, Colourable, Positionable{

    @Override
    Colour getColour();
}
