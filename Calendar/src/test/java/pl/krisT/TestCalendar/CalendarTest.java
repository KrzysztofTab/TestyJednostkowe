package pl.krisT.TestCalendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalendarTest {
    @Test
    public void shouldReturn30For2018_06() {
        // given
        Calendar calendar = new Calendar();
        // when
        int dayCount = calendar.getDaycount(2018, 6);
        // then
        Assertions.assertEquals(30, dayCount);
    }

    @Test
    public void shouldReturn31For2018_07() {
        // given
        Calendar calendar = new Calendar();
        // when
        int dayCount = calendar.getDaycount(2018, 7);
        // then
        Assertions.assertEquals(31, dayCount);
    }

    @Test
    public void shouldReturn31For2018_08() {
        // given
        Calendar calendar = new Calendar();
        // when
        int dayCount = calendar.getDaycount(2018, 8);
        // then
        Assertions.assertEquals(31, dayCount);
    }

    @Test
    public void shouldReturn28For2018_02() {
        // given
        Calendar calendar = new Calendar();
        // when
        int dayCount = calendar.getDaycount(2018, 2);
        // then
        Assertions.assertEquals(28, dayCount);
    }

    @Test
    public void shouldReturn29For2016_02() {
        // given
        Calendar calendar = new Calendar();
        // when
        int dayCount = calendar.getDaycount(2016, 2);
        // then
        Assertions.assertEquals(29, dayCount);
    }

    @Test
    public void shouldReturn28For2010_02() {
        // given
        Calendar calendar = new Calendar();
        // when
        int dayCount = calendar.getDaycount(2010, 2);
        // then
        Assertions.assertEquals(28, dayCount);
    }

    @Test
    public void shouldReturn28For2100_02() {
        // given
        Calendar calendar = new Calendar();
        // when
        int dayCount = calendar.getDaycount(2100, 2);
        // then
        Assertions.assertEquals(28, dayCount);
    }

    @Test
    public void shouldReturn29For2000_02() {
        // given
        Calendar calendar = new Calendar();
        // when
        int dayCount = calendar.getDaycount(2000, 2);
        // then
        Assertions.assertEquals(29, dayCount);
    }
}