package Excercise;

public class Square extends AbstractSuperFigure implements Figure, SuperFigure {
    private double side;
    private Colour colour;
    private double x;
    private double y;

    private Square() {
    }

    public Square(double a) {
        this.side = a;
    }

    @Override
    public double getCircuit() {
        return side * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void setColour(Colour colour) {
        this.colour = colour;
    }

    @Override
    public Colour getColour() {
        return colour;
    }

    @Override
    public void setCoordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getX() {
        return x;
    }

    @Override
    public double getY() {
        return y;
    }

    public static class Builder {
        private Square instance;

        public Builder() {
            instance = new Square();
        }

        Square build() {
            if (instance.side <= 0) {
                throw new IllegalStateException("Square side must be breated than 0");
            }
            return instance;
        }

        Builder withSide(double side) {
            instance.side = side;
            return this;
        }

        Builder withColour(Colour colour) {
            instance.colour = colour;
            return this;
        }

        Builder withCoordinates(double x, double y) {
            instance.setCoordinates(x, y);
            return this;
        }
    }

}
