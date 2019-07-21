package pl.coderslab.testlearning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxValueTest {

    @Test
    public void largest() {
        //given
        int[] intTab = {1, 2, 3, 4};
        int max = 4;
        //when
        int maxResult = MaxValue.largest(intTab);
        //then
        assertEquals("Maksymalna wartość jest niepoprawna", max, maxResult);
    }

    @Test(expected = RuntimeException.class)
    public void largestAndEmptyList() {
        //given
        int[] intTab = {};
        int max = 4;
        //when
        int maxResult = MaxValue.largest(intTab);
        //then
        assertEquals("Maksymalna wartość jest niepoprawna", max, maxResult);
    }
}