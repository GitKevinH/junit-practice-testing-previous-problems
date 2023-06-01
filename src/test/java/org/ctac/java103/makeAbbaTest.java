package org.ctac.java103;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class makeAbbaTest {

    @Test
    @DisplayName("Print out two strings in the form of abba")
    void makeAbba() {
        assertEquals("CTACCOHORTCOHORTCTAC", makeAbba.makeAbba("CTAC","COHORT"));
    }
}