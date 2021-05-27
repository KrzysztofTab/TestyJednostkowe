package pl.krisT.staticImport;

import static org.junit.jupiter.api.Assertions.*; // musi być "static"

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StaticImportExample {
    @DisplayName("Add 2 To 2 And Return 4")
    @Test
    void shouldAdd2To2AndReturn4() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.add(2, 2);

        // then
        assertEquals(4, result);  // statyczne metody
        //assertTrue(result == 4);  // statyczne metody
    }
}
