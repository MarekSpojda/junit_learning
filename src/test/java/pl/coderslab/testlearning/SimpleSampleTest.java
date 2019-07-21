package pl.coderslab.testlearning;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleSampleTest {
    private SimpleSample simpleSample = new SimpleSample();

    @Test
    public void shouldBeTrue() {
        assertTrue(simpleSample.shouldBeTrue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnIllegalArgEx() {
        simpleSample.printMessage(null);
    }
}