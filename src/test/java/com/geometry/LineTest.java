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
    void verticalLineModeledFromSecondPointsShouldReturnCorrectLength() {
        Line line = new Line(0, 0, 0, 1);
        double length = line.length();
        assertEquals(1, length);
    }

    @Test
    void horizontalLineShouldReturnCorrectLength() {
        Line line = new Line(2, 0, 0, 0);
        double length = line.length();
        assertEquals(2, length);
    }

    @Test
    void verticalLineModeledFromFirstPointsShouldReturnCorrectLength() {
        Line line = new Line(0, 3, 0, 0);
        double length = line.length();
        assertEquals(3, length);
    }
}
