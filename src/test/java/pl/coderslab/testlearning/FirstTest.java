package pl.coderslab.testlearning;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class FirstTest {
    private First first = new First();

    @Test
    public void shouldConcatString() {
        //given
        String a = "sta";
        String b = "rt";
        String c = "start";
        //when
        String output = first.concatString(a, b);
        //then
//        assertEquals("Obiekty się rożnią", c, output);
        assertThat(c, is(output));
    }

    @Test
    public void shouldMultiply() {
        //given
        int a = 4;
        int b = 5;
        int c = 20;
        //when ctrl + alt + v proponuje zmienną
        int output = first.multiply(a, b);
        //then
//        assertEquals("Mnożenie nie wyszło", c, output);
        assertThat(c, is(output));
    }
}