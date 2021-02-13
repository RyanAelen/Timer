package nl.ryanaelen.opensource.textdraw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ITextToScreenTest {

    @Test
    void checkIfEmptyReturnTrue() {
        ITextToScreen sut = String::length;
        assertTrue(sut.checkIfNullOrEmpty(""));
    }

    @Test
    void checkIfNullReturnTrue() {
        ITextToScreen sut = String::length;
        assertTrue(sut.checkIfNullOrEmpty(null));
    }

    @Test
    void checkIfNotEmptyReturnFalse() {
        ITextToScreen sut = String::length;
        assertFalse(sut.checkIfNullOrEmpty(" "));
        assertFalse(sut.checkIfNullOrEmpty("A"));
        assertFalse(sut.checkIfNullOrEmpty("AB"));
    }
}