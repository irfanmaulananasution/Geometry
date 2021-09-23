package com.geometry;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class LineTest {
    private static final double EPS = 1e-9;

    @Test
    void coincidePointsShouldReturnZeroLength() {
        Line line = new Line(0, 0, 0, 0);
        double length = line.getLength();
        assertEquals(0, length, EPS);
    }

    @Test
    void sameXAxisAndFirstYLessThanSecondYShouldReturnCorrectLength() {
        Line line = new Line(0, 1, 0, 2);
        double length = line.getLength();
        assertEquals(1, length, EPS);
    }

    @Test
    void sameXAxisShouldReturnCorrectLength() {
        Line line = new Line(0, 4, 0, 2);
        double length = line.getLength();
        assertEquals(2, length, EPS);
    }

    @Test
    void sameYAxisAndFirstXLessThanSecondXShouldReturnCorrectLength() {
        Line line = new Line(1, 0, 4, 0);
        double length = line.getLength();
        assertEquals(3, length, EPS);
    }

    @Test
    void sameYAxisShouldReturnCorrectLength() {
        Line line = new Line(5, 0, 1, 0);
        double length = line.getLength();
        assertEquals(4, length, EPS);
    }

    @Test
    void pointWithNoSameAxisShouldReturnCorrectLength() {
        Line line = new Line(1, 2, 4, 6);
        double length = line.getLength();
        assertEquals(5, length, EPS);
    }

    @Test
    void whenAllEndPointsAreDifferentShouldReturnFalse() {
        Line line1 = new Line(1, 2, 3, 4);
        Line line2 = new Line(5, 6, 7, 8);
        boolean actualResult = line1.isEqual(line2);
        assertFalse(actualResult);
    }
}
