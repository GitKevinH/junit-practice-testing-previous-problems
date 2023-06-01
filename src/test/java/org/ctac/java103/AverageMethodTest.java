package org.ctac.java103;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageMethodTest {

    @Test
    @DisplayName("Add three numbers")
    void sum() {
        assertEquals(23, AverageMethod.sum(12,11,0));
    }

    @Test
    @DisplayName("Get the average of three numbers ")
    void average() {
        assertEquals(2, AverageMethod.average(1,2,3));
    }
}