package Excercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj promień koła: ");
        double radius = scanner.nextDouble();

        System.out.println("Podaj 2 długości boków trójkąta prostokątnego: ");
        double firstSide = scanner.nextDouble();
        double secondSide = scanner.nextDouble();

        System.out.println("Podaj długość boku kwadratu: ");
        double squareWall = scanner.nextDouble();

        System.out.println("Podaj długość boków prostokąta");
        double firstSideRectangle = scanner.nextDouble();
        double secondSideRectangle = scanner.nextDouble();

        Circle circle = new Circle(radius);
        Triangle triangle = new Triangle(firstSide, secondSide);
        Square square = new Square(squareWall);
        Rectangle rectangle = new Rectangle(firstSideRectangle, secondSideRectangle);

        Figure[] figures = new Figure[4];
        figures[0] = circle;
        figures[1] = triangle;
        figures[2] = square;
        figures[3] = rectangle;

        for (Figure figure : figures) {
            System.out.println(figure.introduce());
        }
    }
}
