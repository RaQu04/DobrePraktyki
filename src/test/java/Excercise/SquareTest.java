package Excercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    public static final double Test_a = 5;
    private Square testSquare;


    @BeforeEach
    void setUp(){
        testSquare = new Square(Test_a);
    }

    @Test
    public void shouldCalculateArea(){
        assertEquals(Math.pow(Test_a, 2), testSquare.getArea());
    }

    @Test
    public void shouldCalculateCircumference(){
        assertEquals(Test_a * 4, testSquare.getCircuit());
    }

}