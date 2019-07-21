package pl.coderslab.testlearning;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleSampleTest3 {
    private SimpleSample simpleSample = new SimpleSample();

    @Test
    public void shouldReturnNum2Be2() {
        assertEquals(2, simpleSample.returnNum2());
    }
}