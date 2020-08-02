package Excercise;

public class Rectangle extends AbstractSuperFigure implements Figure, SuperFigure {
    private double a;
    private double b;

    private Rectangle() {
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getCircuit() {
        return (a * 2) + (b * 2);
    }

    @Override
    public double getArea() {
        return a * b;
    }


    @Override
    public void setColour(Colour colour) {

    }

    @Override
    public Colour getColour() {
        return null;
    }

    @Override
    public void setCoordinates(double x, double y) {

    }

    @Override
    public double getX() {
        return this.x;
    }

    @Override
    public double getY() {
        return this.y;
    }


    public static class Builder {

        private Rectangle prototype;
        private double a;
        private double b;
        private Colour colour;


        public Builder() {
            prototype = new Rectangle();
        }

        Rectangle build() {

            return new Rectangle();
        }

        Rectangle.Builder withBaseAndHeight(double a, double b) {
            this.a = a;
            this.b = b;
            return this;
        }

        Rectangle.Builder withColour(Colour colour) {
            this.colour = colour;
            return this;
        }

        Rectangle.Builder withCoordinatesByBuilder(double x, double y) {
            prototype.x = x;
            prototype.y = y;
            return this;
        }

    }
}
