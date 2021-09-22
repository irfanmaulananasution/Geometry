package com.geometry;

public class Line {
    private int x1, y1, x2, y2;
    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double length() {
        int dx = x1-x2;
        int dy = y1-y2;
        double length = (double) Math.abs(dx - dy);
        return length;
    }
}
