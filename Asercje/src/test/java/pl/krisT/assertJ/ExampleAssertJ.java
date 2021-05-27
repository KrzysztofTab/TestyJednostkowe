package pl.krisT.assertJ;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ExampleAssertJ {

    @DisplayName("Name End With Letter 'A'")
    @Test
    public void nameShouldEndWithLetterA() {
        // when
        String name = "Dorota";
        // then
        assertThat(name).endsWith("a");

    }

    @DisplayName("Name Not End With Letter 'A'")
    @Test
    public void nameShouldNotEndWithLetterA() {
        // when
        String name = "Dorota";
        // then
        assertThat(name).doesNotEndWith("b");
    }

    @DisplayName("Simile Name")
    @Test
    public void shouldSimileName() {
        // when
        String name = "Dorota";
        String oderName = "Anna";

        // then
        assertThat(name)
                .isNotEqualTo(oderName)
                .endsWith("a")
                .hasSize(6);
    }
}
