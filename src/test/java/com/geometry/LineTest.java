package com.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineTest {

    @Test
    void coincidePointsShouldReturnZeroLength() {
        Line line = new Line(0, 0, 0, 0);
        double length = line.length();
        assertEquals(0, length);
    }

    @Test
    void verticalLineShouldReturnCorrectLength() {
        Line line = new Line(0, 0, 0, 1);
        double length = line.length();
        assertEquals(1, length);
    }
}
