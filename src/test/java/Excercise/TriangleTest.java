package Excercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

public class TriangleTest {

    public static final double Test_a = 5;
    public static final double Test_b = 10;
    private Triangle testTriangle;

    @BeforeEach
    void setUp() {
        testTriangle = new Triangle(Test_a, Test_b);
    }

    @Test
    public void shouldCalculateArea() {
        assertEquals(((Test_a * Test_b) / 2.0), testTriangle.getArea());
    }

    @Test
    public void shouldCalculateCircumference(){
        assertEquals(Test_a + Test_b + Triangle.getCWall(Test_a, Test_b), testTriangle.getCircuit());
    }


}