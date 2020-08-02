package Excercise;

public class Circle extends AbstractSuperFigure {
    private double radius;

    public Circle() {
    }

    public Circle(double r, Colour colour) {
        this.radius = r;
        this.colour = colour;
    }



    @Override
    public double getCircuit() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // implementacja uproszczona i niepolecana
    // może wpływać na logike konstruktora
    public static class Builder {

        private final Circle prototype;

        public Builder() {
            prototype = new Circle();
        }

        Circle build(){
            if (prototype.radius <= 0) {
                throw new IllegalStateException("Circle radius must be greater than zero");
            }
            return prototype;
        }

        Builder withRadius(double radius) {
            prototype.radius = radius;
            return this;
        }

        Builder withColour(Colour colour) {
            prototype.colour = colour;
            return this;
        }

        Builder withCoordinates(double x, double y) {
            prototype.x = x;
            prototype.y = y;
            return this;
        }
    }

}
