package com.geometry;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LineTest {

    @Test
    void lengthShouldReturnZeroOnAllZeroInput() {
        Line line = new Line(0, 0, 0, 0);
        double length = line.length();
        assertEquals(0, length);
    }

    @Test
    void lengthCalculateAccuratelyForStraightLine() {
        Line line = new Line(0, 0, 0, 5);
        double length = line.length();
        assertEquals(5, length);
    }

    @Test
    void lengthCalculateAccuratelyForDiagonalLine() {
        Line line = new Line(0, 0, 3, 4);
        double length = line.length();
        assertEquals(5, length);
    }
}
