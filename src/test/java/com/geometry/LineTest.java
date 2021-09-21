package com.geometry;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LineTest {

    @Test
    void lengthComputeAccurateCalculation() {
        Line line = new Line(1, 1, 4, 5);
        double length = line.length();
        assertEquals(5, length);
    }
}
