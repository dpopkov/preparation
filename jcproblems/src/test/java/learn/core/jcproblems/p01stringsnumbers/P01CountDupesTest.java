package learn.core.jcproblems.p01stringsnumbers;

import org.junit.Test;

import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;

public class P01CountDupesTest {
    @Test
    public void testCountDuplicates() {
        var p01 = new P01CountDupes();
        assertEquals(-1, p01.countDuplicatesNaiveWay("abc"));
        assertEquals(2, p01.countDuplicatesNaiveWay("aa"));
        assertEquals(3, p01.countDuplicatesNaiveWay("abaca"));
        assertEquals(3, p01.countDuplicatesNaiveWay("abababb"));
    }

    @Test
    public void testCountAllDuplicates() {
        var p01 = new P01CountDupes();
        assertThat(p01.countAllDuplicates("aa").get('a'), is(2L));
        assertThat(p01.countAllDuplicates("abaca").get('a'), is(3L));
        Map<Character, Long> result = p01.countAllDuplicates("abababbb");
        assertThat(result.get('a'), is(3L));
        assertThat(result.get('b'), is(5L));
    }

    @Test
    public void testCountAllDuplicatesStream() {
        var p01 = new P01CountDupes();
        assertThat(p01.countAllDuplicatesUsingStream("aa").get('a'), is(2L));
        assertThat(p01.countAllDuplicatesUsingStream("abaca").get('a'), is(3L));
        Map<Character, Long> result = p01.countAllDuplicatesUsingStream("abababbb");
        assertThat(result.get('a'), is(3L));
        assertThat(result.get('b'), is(5L));
    }
}
