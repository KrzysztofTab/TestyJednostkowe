package pl.krisT;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLifecycle02 {
    private int licznik = 0;

    @BeforeEach
    public void init() {
        System.out.println("Wykonuje BeforeEach");
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
/*
@AfterEach - metoda oznaczona taką adnotacją zostanie uruchomiona po każdym teście
@BeforeAll - metoda zostanie uruchomiona raz przed wszystkimi testami w klasie
@AfterAll - metoda zostanie uruchomiona raz, po wszystkimi testami w klasie
 */