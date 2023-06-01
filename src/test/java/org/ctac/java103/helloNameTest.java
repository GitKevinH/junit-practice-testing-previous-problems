package org.ctac.java103;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class helloNameTest {

    @Test
    @DisplayName("prints out hello + String variable")
    void helloName() {
        assertEquals("Hello CTAC!",helloName.helloName("CTAC"));
    }
}