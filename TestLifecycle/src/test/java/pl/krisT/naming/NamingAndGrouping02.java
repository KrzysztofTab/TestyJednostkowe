package pl.krisT.naming;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NamingAndGrouping02 {

    @Nested  // tworzenie klasy wewnętrznej
    class Calculations {
        @DisplayName("Should add 2 to 2 and return 4")  // nazwa metody testowej
        @Test
        public void shouldAdd2to2AndReturn4() {
        }
    }
    @Nested  // tworzenie klasy wewnętrznej
    class Complicated {
        @DisplayName("Should add 1 to 1 and return 2")  // nazwa metody testowej
        @Test
        public void shouldAdd2to2AndReturn4() {
        }
    }

    @DisplayName("Mail tests")  // nazwa klasy wewnetrznej
    @Nested  // kalsa wewnetrzna
    class Mails {
        @DisplayName("Should send email olny to subscribers")  // nazwa metody testowej
        @Test
        public void shouldSendEmailOnlyToSubscribers() {}

        @DisplayName("Should not send multiple mails to one person")  // nazwa metody testowej
        @Test
        public void shouldNotSendMultipleMailsToOnePerson() {}
    }

    @DisplayName("Should remove cache after invalidate")  // nazwa metody testowej
    @Test
    public void shouldRemoveCacheAfterInvalidate() {
    }
}
