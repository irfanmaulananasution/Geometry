package com.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineTest {

    @Test
    void coincidePointsShouldReturnZeroLength() {
        Line line = new Line(0, 0, 0, 0);
        double length = line.getLength();
        assertEquals(0, length, 1e-9);
    }
}
