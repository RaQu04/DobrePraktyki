package Excercise;

public class Triangle extends AbstractSuperFigure implements Figure, SuperFigure {

    private double base;
    private double height;
    private double hypotenuse;
    private Colour colour;
    private double x;
    private double y;


    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.hypotenuse = Math.sqrt(this.base * this.base + this.height * this.height);
    }

    private Triangle(Builder builder) {
        this.base = builder.base;
        this.colour = builder.colour;
        this.height = builder.height;
        this.x = builder.x;
        this.y = builder.y;
        this.hypotenuse = Math.sqrt(this.base * this.base + this.height * this.height);
    }


    @Override
    public double getCircuit() {
        return base + height + getCWall(base, height);
    }

    @Override
    public double getArea() {
        return (base * height) / 2.0;
    }

    static double getCWall(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
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

        private Colour colour;
        private double height;
        private double x;
        private double y;
        private double base;

        private void setCoordinates(double x, double y) {
            this.x = base;
            this.y = height;
        }

        Triangle build() {
            if (height <= 0 || base <= 0) {
                throw new IllegalStateException("Base and height must be greater than 0");
            }
            return new Triangle(this);
        }

        Builder withBaseAndHeight(double base, double height) {
            this.base = base;
            this.height = height;
            return this;
        }

        Builder withColour(Colour colour) {
            this.colour = colour;
            return this;
        }

        Builder withCoordinatesByBuilder(double x, double y) {
            this.setCoordinates(x, y);
            return this;
        }


    }

}
