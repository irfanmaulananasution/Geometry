package com.geometry;

public class Line {
    private final int y1;
    private final int y2;

    public Line(int x1, int y1, int x2, int y2) {
        this.y1 = y1;
        this.y2 = y2;
    }

    public double getLength() {
        return Math.abs(y2 - y1);
    }
}
