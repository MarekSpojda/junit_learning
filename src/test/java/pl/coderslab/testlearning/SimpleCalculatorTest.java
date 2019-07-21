package pl.coderslab.testlearning;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCalculatorTest {
    private SimpleCalculator simpleCalculator = new SimpleCalculator();

    @Test
    public void add() {
        //given
        int a = 3;
        int b = 7;
        int c = 10;
        //when
        int result = simpleCalculator.add(a, b);
        //then
        assertEquals("Zwykłe dodawanie nie wyszło", c, result);
    }

    @Test
    public void addPositve() {
        //given
        int a = 3;
        int b = 7;
        int c = 10;
        //when
        int result = simpleCalculator.addPositve(a, b);
        //then
        assertEquals("Zwykłe dodawanie nie wyszło", c, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addPositveError() {
        //given
        int a = 3;
        int b = -7;
        int c = 10;
        //when
        int result = simpleCalculator.addPositve(a, b);
        //then
        assertEquals("Zwykłe dodawanie nie wyszło", c, result);
    }
}