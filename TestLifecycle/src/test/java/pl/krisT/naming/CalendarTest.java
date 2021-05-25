package pl.krisT.naming;

import org.junit.jupiter.api.*;

class CalendarTest {

    private Calendar calendar;

    // given
    @BeforeEach
    public void init() {
        calendar = new Calendar();
    }

    @DisplayName("2018-06 -> 30")
    @Test
    void shouldReturn30For2018_06() {
        // when
        int dayCount = calendar.getDaycount(2018, 6);
        // then
        Assertions.assertEquals(30, dayCount);
    }

    @DisplayName("2018-07 -> 31")
    @Test
    public void shouldReturn31For2018_07() {
        // when
        int dayCount = calendar.getDaycount(2018, 7);
        // then
        Assertions.assertEquals(31, dayCount);
    }

    @DisplayName("2018-08 -> 31")
    @Test
    public void shouldReturn31For2018_08() {
        // when
        int dayCount = calendar.getDaycount(2018, 8);
        // then
        Assertions.assertEquals(31, dayCount);
    }

    @DisplayName("2018-02 -> 28")
    @Test
    public void shouldReturn28For2018_02() {
        // given
        Calendar calendar = new Calendar();
        // when
        int dayCount = calendar.getDaycount(2018, 2);
        // then
        Assertions.assertEquals(28, dayCount);
    }

    @DisplayName("2018-02 -> 29")
    @Test
    public void shouldReturn29For2016_02() {
        // when
        int dayCount = calendar.getDaycount(2016, 2);
        // then
        Assertions.assertEquals(29, dayCount);
    }

    @DisplayName("2010-02 -> 28")
    @Test
    public void shouldReturn28For2010_02() {
        // when
        int dayCount = calendar.getDaycount(2010, 2);
        // then
        Assertions.assertEquals(28, dayCount);
    }

    @DisplayName("2100-02 -> 28")
    @Test
    public void shouldReturn28For2100_02() {
        // when
        int dayCount = calendar.getDaycount(2100, 2);
        // then
        Assertions.assertEquals(28, dayCount);
    }

    @DisplayName("2000-02 -> 29")
    @Test
    public void shouldReturn29For2000_02() {
        // when
        int dayCount = calendar.getDaycount(2000, 2);
        // then
        Assertions.assertEquals(29, dayCount);
    }
}