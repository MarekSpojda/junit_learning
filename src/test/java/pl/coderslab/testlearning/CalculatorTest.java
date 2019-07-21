package pl.coderslab.testlearning;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void shouldAdd() {
        //given
        double a = 7;
        double b = 3;
        double expected = 10;
        //when
        double result = calculator.add(a, b);
        //then
        assertEquals("Adding failed", expected, result, 0.001d);
    }

    @Test
    public void shouldSubtract() {
        //given
        double a = 7;
        double b = 3;
        double expected = 4;
        //when
        double result = calculator.subtract(a, b);
        //then
        assertEquals("Subtracting failed", expected, result, 0.001d);
    }

    @Test
    public void shouldMultiply() {
        //given
        double a = 7;
        double b = 3;
        double expected = 21;
        //when
        double result = calculator.multiply(a, b);
        //then
        assertEquals("Multiplying failed", expected, result, 0.001d);
    }

    @Test
    public void shouldDivide() {
        //given
        double a = 7;
        double b = 3;
        double expected = 2.3334;
        //when
        double result = calculator.divide(a, b);
        //then
        assertEquals("Dividing failed", expected, result, 0.001d);
    }

    @Test
    public void shouldBeGreaterAthanB() {
        //given
        double a = 7;
        double b = 3;
        boolean expected = true;
        //when
        boolean result = calculator.greaterAthanB(a, b);
        //then
        assertEquals("Comparing failed", expected, result);
    }

    @Test
    public void evaluatesExpresion() {
        double result = calculator.eval("1+2+3");
        assertEquals(6, result, 0.01);
    }
}