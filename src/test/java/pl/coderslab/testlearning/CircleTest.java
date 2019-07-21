package pl.coderslab.testlearning;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class CircleTest {

    @Test
    public void shouldComputeCircleArea() {
        //given
        Circle circle = new Circle();
        double expectedField = 314.1592653589793d;
        int decimalPlaces = 3;
        double accuracy = 1 / Math.pow(10, decimalPlaces);

        double high = expectedField + accuracy;
        double low = expectedField - accuracy;
        //when
        double result = circle.circleArea(10);
        //then
        assertThat(true, allOf(is(result >= low), is(result <= high)));
    }
}