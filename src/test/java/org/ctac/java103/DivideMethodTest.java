package org.ctac.java103;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideMethodTest {

    @Test
    @DisplayName("divide two ints")
    void divide() {
        assertEquals(10, DivideMethod.divide(20,2));
    }
}