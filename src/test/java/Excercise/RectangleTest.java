package Excercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class RectangleTest {

    public static final double Test_a = 5;
    public static final double Test_b = 7;
    private Rectangle testRectangle;


    @BeforeEach
    void setUp(){
        testRectangle = new Rectangle(Test_a, Test_b);
    }

    @Test
    public void shouldCalculateArea(){
        assertEquals(Test_a* Test_b, testRectangle.getArea());
    }

    @Test
    public void shouldCalculateCircumference(){
        assertEquals((Test_a * 2) + (Test_b * 2), testRectangle.getCircuit());
    }





}