package pl.coderslab.testlearning;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class FactorsTest {
    @Test
    public void shouldGeneratePrimeFactors() {
        //given
        List<Integer> excpected = Arrays.asList(1, 2, 5);
        //when
        List<Integer> toCompare = Factors.generatePrimeFactors(10);
        //then
        assertThat(excpected, is(toCompare));
    }
}