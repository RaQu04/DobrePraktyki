package Excercise;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CircleTest{

    public static final double Test_Radius = 5;
    public static final double EXPECTED_Circuit = 2 * Math.PI * Test_Radius;
    public static final double EXPECTED_CIRCUMFERENCE = (Math.PI * Math.pow(Test_Radius, 2));
    private Circle testCircle;

    @BeforeEach
    void setUp(){
        testCircle = new Circle(Test_Radius, Colourable.Colour.WHITE);
    }

    @Test
    public void shouldCalculateArea(){
        assertEquals(EXPECTED_CIRCUMFERENCE, testCircle.getArea());
    }

    @Test
    public void shouldCalculateCircumference(){
        assertEquals(EXPECTED_Circuit, testCircle.getCircuit());
    }
}