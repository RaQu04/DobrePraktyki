package Excercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class TriangleTest {

    public static final double Test_a = 5;
    public static final double Test_b = 10;
    public static final Colourable.Colour TEST_COLOUR = Colourable.Colour.WHITE;
    private Triangle testTriangle;

    @BeforeEach
    void setUp() {
        //testTriangle = new Triangle(Test_a, Test_b);
        testTriangle = new Triangle.Builder()
                .withBaseAndHeight(Test_a, Test_b)
                .withColour(TEST_COLOUR)
                .withCoordinatesByBuilder(Test_a, Test_b)
                .build();
    }

    @Test
    public void shouldCalculateArea() {
        assertEquals(((Test_a * Test_b) / 2.0), testTriangle.getArea());
    }

    @Test
    public void shouldCalculateCircumference() {
        assertEquals(Test_a + Test_b + Triangle.getCWall(Test_a, Test_b), testTriangle.getCircuit());
    }

    @Test
    void shouldSetColorByBuilder() {
        assertEquals(TEST_COLOUR, testTriangle.getColour());
    }

    @Test
    void shouldSetCoordinatesByBuilder() {
        assertEquals(Test_a, testTriangle.getX());
        assertEquals(Test_b, testTriangle.getY());
    }


}