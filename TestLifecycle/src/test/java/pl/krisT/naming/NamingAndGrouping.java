package pl.krisT.naming;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NamingAndGrouping {
    // @DisplayName - Adnotację dodajemy do metody i jako argument podajemy jak test ma być wyświetlany w ramach wyników
    @DisplayName("Should add 2 to 2 and return 4")
    @Test
    public void shouldAdd2to2AndReturn4() {
    }

    @DisplayName("Should send email olny to subscribers")
    @Test
    public void shouldSendEmailOnlyToSubscribers(){
    }

    @DisplayName("Should remove cache after invalidate")
    @Test
    public void shouldRemoveCacheAfterInvalidate() {
    }
}
