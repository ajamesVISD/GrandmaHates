import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testHasdoubleLetters() {
        assertTrue(App.hasDoubleLetters("cheese"));
        assertFalse(App.hasDoubleLetters("bog"));
        assertFalse(App.hasDoubleLetters(""));
    }
}