package pl.coderslab.testlearning;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleSampleTest2 {
    private SimpleSample simpleSample = new SimpleSample();

    @Test
    public void shouldReturnNumBe2() {
        assertEquals("Metoda returnNum() klasy SimpleSample nie zwróciła oczekiwanego wyniku", 2, simpleSample.returnNum());
        assertNotEquals("Metoda returnNum() klasy SimpleSample zwróciła wynik, który nie powinien się pojawić", 3, simpleSample.returnNum());
    }

    @Test
    public void shouldReturn2dot223() {
        assertEquals(2.22, simpleSample.return2dot223(), 0.01);
//        fail("Test failed intentionally");
    }
}