package pl.coderslab.testlearning;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class NWDTest {

    @Test
    public void shouldCalculateNwd() {
        //given
        NWD nwd = new NWD();

        //when
        int result = nwd.nwd(1200, 1400);

        //then
        assertThat(200, is(result));
    }
}