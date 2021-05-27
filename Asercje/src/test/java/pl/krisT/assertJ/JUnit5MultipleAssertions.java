package pl.krisT.assertJ;

import org.junit.jupiter.api.Test;
import pl.krisT.asercja.Superhero;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class JUnit5MultipleAssertions {

    @Test
    void multipleAssertionsTogetherWithJUnit() {
        Superhero hulk = Superheros.getHulk();
        assertAll(
                () -> assertThat(hulk.getAbilities()).contains("intelligence"),
                () -> assertThat(hulk.getColor()).isEqualTo("blue"),
                () -> assertThat(hulk.getPublisher()).isEqualTo("Disney")
        );
    }
}

