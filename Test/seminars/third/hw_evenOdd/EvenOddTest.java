package seminars.third.hw_evenOdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EvenOddTest {

    private EvenOdd evenOdd;

    @BeforeEach
    void setUp() {
        evenOdd = new EvenOdd();
    }
    @Test
    void evenNumTest() {
        assertTrue(evenOdd.evenOddNumber(50));
    }

    @Test
    void oddNumTest() {
        assertFalse(evenOdd.evenOddNumber(43));
    }

    @Test
    void evenOddNumber() {
    }
}
