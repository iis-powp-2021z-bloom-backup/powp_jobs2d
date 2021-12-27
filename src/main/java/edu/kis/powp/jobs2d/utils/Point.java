package edu.kis.powp.jobs2d.utils;

// simple pojo helper class since Java does not offer tuples out of the box
public class Point {
    private final int x;
    private final int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static Point point(int x, int y) {
        return new Point(x, y);
    }
}
