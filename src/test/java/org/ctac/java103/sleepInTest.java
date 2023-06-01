package org.ctac.java103;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sleepInTest {

    @Test
    @DisplayName("Checks to see if you can sleep in by looking if it's a weekday or you're on vacation")
    void sleepIn() {
        assertEquals(true, sleepIn.sleepIn(false,true));
    }
}