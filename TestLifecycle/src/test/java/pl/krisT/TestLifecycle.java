package pl.krisT;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLifecycle {
    private int licznik;

    @BeforeEach
    public void init() {
        System.out.println("Wykonuje BeforeEach");
        licznik = 0;
    }

    @Test
    public void test1() {
        System.out.println("Wykonuje test 1. Licznik to: " + licznik);
        licznik = 1;
    }

    @Test
    public void test2() {
        System.out.println("Wykonuje test 2. Licznik to: " + licznik);
        licznik = 2;
    }

    @Test
    public void test3() {
        System.out.println("Wykonuje test 3. Licznik to: " + licznik);
        licznik = 3;
    }
}
