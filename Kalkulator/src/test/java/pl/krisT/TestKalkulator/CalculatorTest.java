package pl.krisT.TestKalkulator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void shouldAdd1To1AndReturn2() {
        // given - przygotowanie danych testowych i środowiska
        int a = 1;
        int b = 1;
        Calculator calculator = new Calculator();

        // when - wykonanie kodu który chcemy przetestować czy działa poprawnie
        int result = calculator.add(a, b);

        // then - sprawdzenie czy wynik jest taki jak się spodziewamy
        Assertions.assertEquals(2, result);
    }

    @Test
    public void shouldAdd5To2AndReturn7() {
        // given - przygotowanie danych testowych i środowiska
        int a = 5;
        int b = 2;
        Calculator calculator = new Calculator();

        // when - wykonanie kodu który chcemy przetestować czy działa poprawnie
        int result = calculator.add(a, b);

        // then - sprawdzenie czy wynik jest taki jak się spodziewamy
        Assertions.assertEquals(7, result);
    }
}