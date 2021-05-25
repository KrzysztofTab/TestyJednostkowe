package pl.krisT.asercja;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class JUnit5AssertionsTest {

    // given
    private final JUnit5Assertions sut = new JUnit5Assertions();

    @DisplayName("Prime Number")  // nazwa klasy wewnetrznej
    @Nested  // kalsa wewnetrzna
    class primeNumber {
        @DisplayName("Be Prime For 1")
        @Test
        public void shouldBePrimeFor1() {
            // when
            boolean result = sut.isPrimeNumber(1);
            // then
            Assertions.assertTrue(result);
        }

        @DisplayName("Be Prime For 2")
        @Test
        public void shouldBePrimeFor2() {
            // when
            boolean result = sut.isPrimeNumber(2);
            // then
            Assertions.assertTrue(result);
        }

        @DisplayName("No Be Prime For 10")
        @Test
        public void shouldNoBePrimeFor10() {
            // when
            boolean result = sut.isPrimeNumber(10);
            // then
            Assertions.assertFalse(result);
        }

        @DisplayName("Be Prime For 11")
        @Test
        public void shouldBePrimeFor11() {
            // when
            boolean result = sut.isPrimeNumber(11);
            // then
            Assertions.assertTrue(result);
        }

        @DisplayName("Be Prime For 13")
        @Test
        public void shouldBePrimeFor13() {
            // when
            boolean result = sut.isPrimeNumber(13);
            // then
            Assertions.assertTrue(result);
        }

        @DisplayName("No Be Prime For 9")
        @Test
        public void shouldNoBePrimeFor9() {
            // when
            boolean result = sut.isPrimeNumber(9);
            // then
            Assertions.assertFalse(result);
        }
    }

    @DisplayName("Returns Code for given key")  // nazwa klasy wewnetrznej
    @Nested  // kalsa wewnetrzna
    class givenKey {
        @DisplayName("Return Valid Code")
        @Test
        public void shouldReturnValidCode() {
            // when
            JUnit5Assertions.Code code = sut.getCode("a");
            // then
            Assertions.assertEquals("a", code.getKey());
            Assertions.assertNotNull(code.getCreatedAtTimestamp());
            Assertions.assertNotNull(code.getCode());
        }

        @DisplayName("Return Same Objects")
        @Test
        public void shouldReturnSameObjects() {
            // when
            JUnit5Assertions.Code code = sut.getCode("a");
            JUnit5Assertions.Code code2 = sut.getCode("a");

            // then
            Assertions.assertSame(code, code2);
        }

        @DisplayName("Return Different Objects")
        @Test
        public void shouldReturnDifferentObjects() {
            // when
            JUnit5Assertions.Code code = sut.getCode("a");
            JUnit5Assertions.Code code2 = sut.getCode("b");

            // then
            Assertions.assertNotSame(code, code2);
        }
    }
}