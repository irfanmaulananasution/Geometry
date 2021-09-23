package com.geometry;

public class Line {
    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getLength() {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public boolean isEqual(Line other) {
        if (other == null) {
            return false;
        }
        return Math.min(x1, x2) == Math.min(other.x1, other.x2)
            && Math.max(x1, x2) == Math.max(other.x1, other.x2)
            && Math.min(y1, y2) == Math.min(other.y1, other.y2)
            && Math.max(y1, y2) == Math.max(other.y1, other.y2);
    }
}
