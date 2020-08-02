package Excercise;

public class FigureFactory {

    private static final Colourable.Colour DEAFAULT_COLOR = Colourable.Colour.WHITE;
    private static final double DEFAULT_Y = 0.0;
    private static final double DEFAULT_X = 0.0;

    public static enum FigureType {
        CIRCLE, SQUARE, RIGHT_TRIANGLE, RECTANGLE
    }

    public static SuperFigure createFigure(FigureType figureType, double size) {
        switch (figureType) {
            case CIRCLE:
                return new Circle.Builder()
                        .withRadius(size)
                        .withColour(DEAFAULT_COLOR)
                        .withCoordinates(DEFAULT_X, DEFAULT_Y)
                        .build();
            case SQUARE:
                return new Square.Builder()
                        .withSide(size)
                        .withColour(DEAFAULT_COLOR)
                        .build();

            default:
                throw new IllegalArgumentException("This figure requires more size arguments");
        }
    }

    public static SuperFigure createFigure(FigureType figureType, double sizeA, double sizeB) {
        switch (figureType) {
            case RIGHT_TRIANGLE:
                return new Triangle.Builder()
                        .withBaseAndHeight(sizeA, sizeB)
                        .withColour(DEAFAULT_COLOR)
                        .withCoordinatesByBuilder(DEFAULT_X, DEFAULT_Y)
                        .build();
            case RECTANGLE:
                return new Rectangle.Builder()
                        .withBaseAndHeight(sizeA, sizeB)
                        .withColour(DEAFAULT_COLOR)
                        .withCoordinatesByBuilder(DEFAULT_X, DEFAULT_Y)
                        .build();

            default:
                throw new IllegalArgumentException("This figure requires more size arguments");
        }
    }
}
