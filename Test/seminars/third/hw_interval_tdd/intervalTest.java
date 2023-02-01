package seminars.third.hw_interval_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class intervalTest {
    @Test
    void InIntervalTest(){
        Interval interval = new Interval();
        assertTrue(interval.numberInInerval(50));
    }
    @Test
    void OutLess25InIntervalTest(){
        Interval interval = new Interval();
        assertFalse(interval.numberInInerval(10));
    }

    @Test
    void OutMore100InIntervalTest(){
        Interval interval = new Interval();
        assertFalse(interval.numberInInerval(150));
    }

    @Test
    void Out25InIntervalTest(){
        Interval interval = new Interval();
        assertFalse(interval.numberInInerval(25));
    }

    @Test
    void Out100InIntervalTest(){
        Interval interval = new Interval();
        assertFalse(interval.numberInInerval(100));
    }
}
