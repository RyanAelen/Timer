package nl.ryanaelen.opensource.time;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class TimerTest {

    @Test
    void getTimeFormat() {
        Timer sut = new Timer(LocalTime.of(10, 0));
        assertEquals("10:00:00", sut.getTimeFormat(LocalTime.of(10, 0)));
        assertEquals("11:00:00", sut.getTimeFormat(LocalTime.of(11, 0)));
        assertEquals("11:01:01", sut.getTimeFormat(LocalTime.of(11, 1, 1)));
        assertEquals("11:01:01", sut.getTimeFormat(LocalTime.of(11, 1, 1, 1)));
        assertEquals("11:01:01", sut.getTimeFormat(LocalTime.of(11, 1, 1, 999999999)));
        assertEquals("23:59:59", sut.getTimeFormat(LocalTime.MAX));
        assertEquals("00:00:00", sut.getTimeFormat(LocalTime.MIN));
    }

    @Test
    void getTimeLeftString() {
        Timer sut = new Timer(LocalTime.of(20, 0));
        assertEquals("10:00:00", sut.getTimeLeftString(LocalTime.of(10, 0)));
    }

    @Test
    void getTimeBetwean() {
    }
}